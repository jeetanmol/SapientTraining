package com.training.exercise1;

public class TaxWhiz {

	private double currentRate;
	
	public TaxWhiz(double currentRate) {
		this.currentRate = currentRate;
	}
	
	/**
	 * Method to calculate the tax amount on your purchase
	 * @param purchase is the purchase 
	 * @return total tax calculated
	 */
	public double calcTax(double purchase){
		
		return (purchase * currentRate)/100;
		
	}
}
