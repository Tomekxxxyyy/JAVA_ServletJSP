package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.RegisteredUsers;
import domain.User;

/**
 * Servlet implementation class RegisteredUsersServlet
 */
@WebServlet("/RegisteredUsersServlet")
public class RegisteredUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisteredUsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher display = request.getRequestDispatcher("DisplayServlet");
		ServletContext context = request.getServletContext();
		Enumeration<String> parameterNames = request.getParameterNames();
		RegisteredUsers registeredUsers = new RegisteredUsers();
		String userIndex = parameterNames.nextElement();
		String premiumStatus = request.getParameter(userIndex);
			registeredUsers.setRegisteredUsers((ArrayList<User>) context.getAttribute("registeredUsers"));
			registeredUsers.premiumStatus(Integer.parseInt(userIndex),Boolean.parseBoolean(premiumStatus));
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
