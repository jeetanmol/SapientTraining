package com.training.exercise3;

public class Fan extends ChennaiRentalItem{
	
	
	
	
	@Override
	 void  setSerialId(int key) {
		switch(key){
		case 1:
			serialId = 101;
			rent = 200;
			break;
		case 2:
			serialId = 102;
			rent = 250;
			break;
		case 3:
			serialId = 103;
			rent = 300;
			break;
		default:
			serialId = 101;
			rent = 200;
			break;
		}
		
		
	}

	public Fan(int days, int items) {
		super(days, items);
		// TODO Auto-generated constructor stub
	}

	

	
}
