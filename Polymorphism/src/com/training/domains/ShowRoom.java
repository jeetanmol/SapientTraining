package com.training.domains;

import com.training.ifaces.Automobile;

public class ShowRoom {
	
	public Automobile getItem(int key){
		switch (key) {
		case 1:
			return new PassengerCar();
			
		case 2 :
			return new LuxuryCar();
		case 3 :
			return new SportsCar();
		
		case 5: 
			System.exit(0);
		default:
			System.out.println("Wrong Choice");
			return null;
		
		}
	}
	
	/**
	 * 
	 * @param polyAuto prints the quotation of the vehicle
	 */
	public void printQuote(Automobile polyAuto){
		
		System.out.println("========== Quotation ==========");
		System.out.println("Model :=" + polyAuto.getMode1());
		System.out.println("Color :=" + polyAuto.getColor());
		System.out.println("Price :=" + polyAuto.getPrice());
		
	}

}
