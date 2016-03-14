package com.training.exercise3;

public abstract class ChennaiRentalItem {
	
	
	protected int days;
	protected int items;
	protected int serialId;
	protected double rent;
	

	 


	public void setDays(int days) {
		this.days = days;
	}



	public void setItems(int items) {
		this.items = items;
	}

	

	

	public ChennaiRentalItem(int days, int items) {
		super();
		this.days = days;
		this.items = items;
	}



	public int getSerialId() {
		return serialId;
	}



	abstract void setSerialId(int key);
	
	double calRent(){
		return days * items * rent;
	}
		 		

}
