package com.training;

public class Application1 {

	public static void main(String[] args)
	{
		
		convertor obj = new convertor();
		double cel = obj.fartoCelsius(45.00);
		System.out.println("Celsius value of 45F is " + cel);
		
		Double faren = null;
		double cel1 = 0.0;
		try{
		 cel1 = obj.fartoCelsius(faren);
		}
		
		catch(NullPointerException n)
		{
			System.out.println("Faren should not be null");
			System.out.println(n.getClass());
		}
		
		System.out.println("Celsius value of 45F is " + cel1);
		
		
	}
}
