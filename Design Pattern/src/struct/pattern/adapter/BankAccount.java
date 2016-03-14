package struct.pattern.adapter;

public class BankAccount {
	
	private double principle;
	
	public BankAccount(double principle){
		
		this.principle = 5000.00;
	}

	public double calculate(){
		return principle * .10;
	}
}
