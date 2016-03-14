package creat.pattern.factory;

/*
 * 
 * Sub Class -1 - Product -1
 */
public class HousingLoan extends LoanAccount {

	private int processingFee;
	
	public HousingLoan(int rateOfInterest) {
		super(rateOfInterest);
		this.processingFee = 4000;
		
	}

	@Override
	public double calculateLoan(double loanAmount,double time) {
		
		return (loanAmount * getRateOfInterest() * time)/100 + processingFee;
		
		
		
	}

}
