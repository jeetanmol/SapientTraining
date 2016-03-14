package com.training.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
public class AuthenticationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthenticationFilter() {
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
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("Pre Process by Authentication Filter");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		String role = (String) request.getAttribute("role");
		RequestDispatcher req = null;
		
		if(role.equals("chef")){
			req = request.getRequestDispatcher("chef.html");
			
		}
		if(role.equals("waiter")){
			req = request.getRequestDispatcher("waiter.html");
			
		}
		if(role.equals("manager")){
			req = request.getRequestDispatcher("manager.html");
			
		}
		req.forward(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
