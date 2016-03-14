package com.training;

public class LoanPersonal extends Loan {
	
	private double customersalary;
	
	public double getCustomersalary() {
		return customersalary;
	}

	public void setCustomersalary(double customersalary) {
		this.customersalary = customersalary;
	}
	public double calculateLoan(){
		
		Customer cust = new Customer();
		loanAmt = customersalary * 12;
		return loanAmt;
		
			
		
	}
	
	public double calculateInterest()
	{
		if(loanAmt < 50000)
		{
		 return (loanAmt * 14)/100; 
		}
		
		if(loanAmt > 50000)
		{
		 return (loanAmt * 13)/100; 
		}
		 
		
	}

}
