package web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.AddressFactory;
import domain.Addresses;
import domain.RegisteredUsers;
import domain.User;
import domain.Validator;

/**
 * Servlet implementation class EditAddressServlet
 */
@WebServlet("/EditAddressServlet")
public class EditAddressServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditAddressServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher display = request.getRequestDispatcher("DisplayServlet");
		RegisteredUsers registeredUsers = new RegisteredUsers();
		ServletContext context = request.getServletContext();
		Validator validator = new Validator();
		AddressFactory factory = new AddressFactory();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		String addressType = request.getParameter("addressType");
		String voivodeship = request.getParameter("voivodeship");
		String city = request.getParameter("city");
		String postcode = request.getParameter("postcode");
		String street = request.getParameter("street");
		String houseNumber = request.getParameter("houseNumber");
		String index = request.getParameter("index");
		Addresses address = factory.createAddress(addressType);
			address.setVoivodeship(voivodeship);
			address.setCity(city);
			address.setPostcode(postcode);
			address.setStreet(street);
			address.setHouseNumber(houseNumber);
			registeredUsers.setRegisteredUsers((ArrayList<User>) context.getAttribute("registeredUsers"));
			int indexOfUser = validator.indexOf(registeredUsers.getRegisteredUsers(), user.getUserName(), user.getPassword());
			user.editList(Integer.parseInt(index), address);
			registeredUsers.updateUser(user, indexOfUser);
			context.setAttribute("registeredUsers", registeredUsers.getRegisteredUsers());
			display.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
