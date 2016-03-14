package com.training.entity;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	private int bookNumber;
	private String bookName;
	private String author;
	private String subject;
	
	private ISBN isbnCode;
	
	Logger log = Logger.getLogger(this.getClass().getName());
	public Book() {
		super();
		log.info("book initialized");
		// TODO Auto-generated constructor stub
	}
	
	
	


	public Book(int bookNumber, String bookName, String author, String subject, ISBN isbnCode) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.subject = subject;
		this.isbnCode = isbnCode;
	}



	public ISBN getIsbnCode() {
		return isbnCode;
	}

	public void setIsbnCode(ISBN isbnCode) {
		this.isbnCode = isbnCode;
	}

	public int getBookNumber() {
		log.info(" Getting the Book Number ");
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
		log.info("Book Number is set");
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + ", subject="
				+ subject + ", log=" + log + "]";
	}
	
	
	

}
