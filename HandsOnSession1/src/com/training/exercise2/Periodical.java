package com.training.exercise2;

public class Periodical extends MediaType {
	
	private int lendingTime;

	public Periodical(String title, String author, String subject, int volume, double rating, int lendingTime) {
		super(title, author, subject, volume, rating);
		this.lendingTime = lendingTime;
	}

	public int getLendingTime() {
		return lendingTime;
	}

	public void setLendingTime(int lendingTime) {
		this.lendingTime = lendingTime;
	}
	
	public void getDetails(){
		super.getDetails();
		System.out.println("Lending Time: " + getLendingTime());
	}
	

}
