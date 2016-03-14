package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class GreetingServlet
 */
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	java.util.logging.Logger log = Logger.getLogger(this.getClass().getName());
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GreetingServlet() {
        super();
        log.info("=== Constructor Called ===");
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		log.info("Vendor - Request Object : " +request.getClass().toString());
		log.info("Vendor - Responset Object : "+ response.getClass().toString());
		PrintWriter out=response.getWriter();
		
		response.setContentType("text/html");
		
		int user = Integer.parseInt(request.getParameter("username"));
		String password = request.getParameter("password");
		
		//String role = request.getParameter("role");
		out.println("<h1 style='text=align:center'>Welcome to servlet programming \n");
		User u = new User(user,password);
		
		ValidateUser val = new ValidateUser();
		if(val.validate(u)){
			out.println("User is a valid person");
		}
		else
			out.println("Please enter valid ceredentials");
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
