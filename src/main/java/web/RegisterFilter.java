package web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.Validator;

/**
 * Servlet Filter implementation class RegisterFilter
 */
@WebFilter("/*")
public class RegisterFilter implements Filter {

    /**
     * Default constructor. 
     */
    public RegisterFilter() {
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
		
		Validator validator = new Validator();
		RequestDispatcher index = request.getRequestDispatcher("index.jsp");
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		String email = request.getParameter("email");
			validator.isPasswordEqual(password, password2);
			validator.isEmptyField(userName, email, password, password2);
						
		if(validator.getMessage() != null){	
			request.setAttribute("message", validator.getMessage());
			index.forward(request, response);
		}
		else
			chain.doFilter(request, response);
		
		request.setAttribute("message", "Rejestracja zakończyła się powodzeniem");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
