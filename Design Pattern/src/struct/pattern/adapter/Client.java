package struct.pattern.adapter;

public class Client {

	public static void main(String[] args) {
		
		BankAccountAdapter adapter = new BankAccountAdapter(40000, new LifeInsurance(500000));
		
		double totalDue = adapter.findTotalDue();
		
		System.out.println("Total Due: " + totalDue);
		

	}

}
