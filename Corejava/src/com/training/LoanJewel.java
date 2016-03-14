package com.training;

public class LoanJewel extends Loan{
	
	private double grams;
	
	
	
	public double getGrams() {
		return grams;
	}

	public void setGrams(double grams) {
		this.grams = grams;
	}

	public double calculateLoan(){
		
		
		loanAmt = grams * 12;
		return loanAmt;
		
			
		
	}
	
	public double calculateInterest()
	{
		if(grams < 100)
		{
		 return (loanAmt * 10)/100; 
		}
		
		else
		{
		 return (loanAmt * 11)/100; 
		}
		 
		
	}
	

}
