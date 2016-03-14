package com.training;

public class convertor {
	
	public double fartoCelsius (Double faren) throws NullPointerException
	{
		double cell = 0.0;
		
		 cell = (5.0/9.0) * (faren - 32);
		
		
		return cell;
	}

}
