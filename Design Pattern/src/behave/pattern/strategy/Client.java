package behave.pattern.strategy;

public class Client {

	public static void main(String[] args) {
		
		CardPayment card = new CardPayment();
		
		BillPayment bill = new BillPayment(card);
		
		System.out.println(bill.makePayment(1000, "HDFC card"));
		
		
		
	}
}
