package com.training.exercise3;

public class Vessel extends ChennaiRentalItem {

	@Override
	void setSerialId(int key) {
		 
				switch(key){
				case 1:
					serialId = 401;
					rent = 100;
					break;
				case 2:
					serialId = 402;
					rent = 250;
					break;
				case 3:
					serialId = 403;
					rent = 300;
					break;
				default:
					serialId = 401;
					rent = 100;
					break;
				}
		
	}
	
	
	

	public Vessel(int days, int items) {
		super(days, items);
		// TODO Auto-generated constructor stub
	}
}