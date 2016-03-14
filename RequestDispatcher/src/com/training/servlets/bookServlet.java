package com.training.servlets;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.domain.BookManager;
import com.training.entity.Book;

/**
 * Servlet implementation class bookServlet
 */
@WebServlet("/bookServlet")
public class bookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		BookManager mgr = new BookManager();
		
		
		HashMap<Long, Book> bookList = new HashMap<Long,Book>();
		if(request.getParameter("search") != null){
			long id = Long.parseLong(request.getParameter("search"));
			Book book = mgr.findBookById(id);
			bookList.put(id,book);
		}
		else{
			 bookList = mgr.getAllBooks();
		}
		
		request.setAttribute("foundBooks", bookList);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ShowBooks.jsp");
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
