package com.training.exercise2;



public class Books extends MediaType {
	
	private int ISBN;

	




	


	public Books(String title, String author, String subject, int volume, double rating, int iSBN) {
		super(title, author, subject, volume, rating);
		ISBN = iSBN;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	
	public void getDetails(){
		super.getDetails();
		System.out.println("ISBN: " + getISBN());
	}

}
