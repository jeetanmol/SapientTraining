package creat.pattern.factory;



public class Client {

	public static void main(String[] args) {
		
		LoanAccount account1 = LoanFactory.getInstance();
		
		System.out.println("Loan Calculated is: " + account1.calculateLoan(500000, 2));
		
		LoanAccount account2 = LoanFactory.getInstance("housing");
		
		System.out.println("Loan Calculated is: " + account2.calculateLoan(500000, 2));
		
		

	}

}
