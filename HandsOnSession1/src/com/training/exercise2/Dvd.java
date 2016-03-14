package com.training.exercise2;

public class Dvd extends MediaType{
	
	private double runningTime;

	public Dvd(String title, String author, String subject, int volume, double rating, double runningTime) {
		super(title, author, subject, volume, rating);
		this.runningTime = runningTime;
	}

	public double getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(double runningTime) {
		this.runningTime = runningTime;
	}
	
	public void getDetails(){
		super.getDetails();
		System.out.println("Running Time: " + getRunningTime());
	}

}
