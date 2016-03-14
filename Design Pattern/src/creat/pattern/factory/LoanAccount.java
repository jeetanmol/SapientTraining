package creat.pattern.factory;

/*
 * Super Type - Super Class
 */

public abstract class LoanAccount {

	private int rateOfInterest;
	
	public abstract double calculateLoan(double loanAmount,double time);

	public LoanAccount(int rateOfInterest) {
		super();
		this.rateOfInterest = rateOfInterest;
	}

	public int getRateOfInterest() {
		return rateOfInterest;
	}
	
	
}
