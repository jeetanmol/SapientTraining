package com.training.exercise3;

public class AirConditioner extends ChennaiRentalItem{

	

	@Override
	void setSerialId(int key) {
		 {
				switch(key){
				case 1:
					serialId = 201;
					rent = 1000;
					break;
				case 2:
					serialId = 202;
					rent = 1500;
					break;
				case 3:
					serialId = 203;
					rent = 1700;
					break;
				default:
					serialId = 201;
					rent = 1000;
					break;
				}
		
	}

	
	
}

	public AirConditioner(int days, int items) {
		super(days, items);
		// TODO Auto-generated constructor stub
	}
}
