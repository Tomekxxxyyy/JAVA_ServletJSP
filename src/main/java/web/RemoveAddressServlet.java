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
import domain.RegisteredUsers;
import domain.User;
import domain.Validator;

/**
 * Servlet implementation class RemoveAddressServlet
 */
@WebServlet("/RemoveAddressServlet")
public class RemoveAddressServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveAddressServlet() {
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
		HttpSession session = request.getSession();
		String indexOfAddress = request.getParameter("index");
		User user = (User) session.getAttribute("user");
			registeredUsers.setRegisteredUsers((ArrayList<User>) context.getAttribute("registeredUsers"));
			int indexOfUser = validator.indexOf(registeredUsers.getRegisteredUsers(), user.getUserName(), user.getPassword());
			user.removeFromList(Integer.parseInt(indexOfAddress));
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
