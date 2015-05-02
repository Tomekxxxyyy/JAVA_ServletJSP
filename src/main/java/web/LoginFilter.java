package web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import domain.RegisteredUsers;
import domain.User;
import domain.Validator;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginServlet")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		RequestDispatcher admin = request.getRequestDispatcher("AdminServlet");
		RequestDispatcher display = request.getRequestDispatcher("DisplayServlet");
		ServletContext context = request.getServletContext();
		Validator validator = new Validator();
		RegisteredUsers registeredUsers = new RegisteredUsers();
			registeredUsers.setRegisteredUsers((ArrayList<User>) context.getAttribute("registeredUsers"));
			validator.isCorrectLogin(registeredUsers.getRegisteredUsers(),request.getParameter("userName") , request.getParameter("password"));
			if(request.getParameter("userName").equals("admin") && request.getParameter("password").equals("admin")){
				admin.forward(request, response);		
			}
			if(validator.getMessage() != null){	
				request.setAttribute("message", validator.getMessage());
				display.forward(request, response);
			}
			else{
				request.setAttribute("message", validator.getMessage());
				request.setAttribute("user", validator.getUser());
				chain.doFilter(request, response);
			}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
