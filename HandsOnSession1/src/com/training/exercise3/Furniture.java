package com.training.exercise3;

public class Furniture extends ChennaiRentalItem{

	@Override
	void setSerialId(int key) {
		 
				switch(key){
				case 1:
					serialId = 301;
					rent = 260;
					break;
				case 2:
					serialId = 302;
					rent = 250;
					break;
				case 3:
					serialId = 303;
					rent = 300;
					break;
				default:
					serialId = 301;
					rent = 260;
					break;
				}
		
	}
	
	
	



	public Furniture(int days, int items) {
		super(days, items);
		// TODO Auto-generated constructor stub
	}
	}
