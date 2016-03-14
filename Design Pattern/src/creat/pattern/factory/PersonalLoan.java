package creat.pattern.factory;

/*
 * 
 * Sub Class: -2 Product: -2
 */
public class PersonalLoan extends LoanAccount {

	public PersonalLoan(int rateOfInterest) {
		super(rateOfInterest);
		
	}

	@Override
	public double calculateLoan(double loanAmount, double time) {
		
		
		return (loanAmount * time * getRateOfInterest())/100;
	}

}
