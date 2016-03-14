package com.training.listeners;


import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.training.utils.SqlConnection;

/**
 * Application Life cycle Listener implementation class MyContextListener
 *
 */
public class MyContextListener implements ServletContextListener,ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public MyContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent event)  { 
       System.out.println("Context - Destroyed ========");
      
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  { 
         System.out.println("Context - Initialized ======== ");
         String userName = event.getServletContext().getInitParameter("userName");
         String password = event.getServletContext().getInitParameter("password");
         String url = event.getServletContext().getInitParameter("url");
         String className = event.getServletContext().getInitParameter("className");
         
       
         event.getServletContext().setAttribute("con", SqlConnection.getOracleConnection( userName, password, url, className));
         
         
    }

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("Attribute Added " + event.getServletContext().getAttributeNames());
		
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println("Attribute Removed " + event.getServletContext().getAttributeNames());
		
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
