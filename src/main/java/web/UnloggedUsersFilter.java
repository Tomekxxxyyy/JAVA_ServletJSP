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

/**
 * Servlet Filter implementation class UnloggedUsersFilter
 */
@WebFilter(urlPatterns = {"/user.jsp", "/premium.jsp", "/admin.jsp", "/addressesForm.jsp", "/editAddressesForm.jsp"})
public class UnloggedUsersFilter implements Filter {

    /**
     * Default constructor. 
     */
    public UnloggedUsersFilter() {
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
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		RequestDispatcher display = req.getRequestDispatcher("DisplayServlet");
		HttpSession session = req.getSession();
		
		if(session.getAttribute("user") == null)
			display.forward(request, response);
		else
			chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
