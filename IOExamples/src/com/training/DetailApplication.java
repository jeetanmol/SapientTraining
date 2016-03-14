package com.training;

import java.io.File;

public class DetailApplication {
	
	public static void main(String[] args) {
		
		
		BookManager bookManager = new BookManager();
		
		Book b1 = new Book(101,"Da Vinci Code1","Dan Brown",500);
		Book b2 = new Book(101,"Emma","Jane Austin",500);
		Book[] books = {b1,b2};
		
		System.out.println(bookManager.addBooks(books));
		
		bookManager.printBooks(new File("Book.ser"));
		
		
	}

}
