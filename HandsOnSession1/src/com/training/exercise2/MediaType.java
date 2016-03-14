package com.training.exercise2;

public class MediaType {
	protected String title;
	protected String author;
	protected String subject;
	protected int volume;
	protected double rating;
	
	
	
	public MediaType() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MediaType(String title, String author, String subject, int volume, double rating) {
		super();
		this.title = title;
		this.author = author;
		this.subject = subject;
		this.volume = volume;
		this.rating = rating;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
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


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	public void getDetails(){
		
		System.out.println("Title: " + getTitle());
		System.out.println("Author:" + getAuthor());
		System.out.println("Subject " + getSubject() );
		System.out.println("Volume: " + getVolume());
		System.out.println("Rating: " + getRating());
	}
	
	
	
	
	
	
	

}
