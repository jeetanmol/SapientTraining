package com.training.domains;

import com.training.ifaces.Automobile;

public class Bike implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 400000;
	}

	@Override
	public String getMode1() {
		// TODO Auto-generated method stub
		return "Avenger";
	}

}
