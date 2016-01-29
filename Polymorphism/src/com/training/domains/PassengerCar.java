package com.training.domains;

import com.training.ifaces.Automobile;

public class PassengerCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 600000;
	}

	@Override
	public String getMode1() {
		// TODO Auto-generated method stub
		return "Suzuki";
	}

}
