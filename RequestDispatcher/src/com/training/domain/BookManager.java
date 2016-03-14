package com.training.domain;

import java.util.HashMap;

import com.training.entity.Book;

public class BookManager {

	private HashMap<Long, Book> bookList;
	
	public BookManager(){
		
		bookList = new HashMap<Long,Book>();
		init();
		
	}
	
	public void init(){
		
		Book b1 = new Book(101, "Da Vinci Code", "Dan Brown", 400);
		Book b2 = new Book(102, "The Notebook", "Nicholas Spark", 200);
		Book b3 = new Book(103, "Emma", "Jane Austen", 350);
		Book b4 = new Book(104, "Pride & Prejudice", "Jane Austen", 250);
		
		bookList.put(b1.getBookNumber(), b1);
		bookList.put(b2.getBookNumber(), b2);
		bookList.put(b3.getBookNumber(), b3);
		bookList.put(b4.getBookNumber(), b4);
		
	}
	public HashMap<Long, Book> getAllBooks(){
		
		
		return bookList;
	}
	
	public Book findBookById(long id){
		
		Book foundBook = null;
		foundBook = bookList.get(id);
		return foundBook;
	}
}
