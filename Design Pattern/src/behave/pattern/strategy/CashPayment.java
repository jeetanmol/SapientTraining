package behave.pattern.strategy;

public class CashPayment implements PaymentStrategy {

	@Override
	public String pay(double amount, String description) {
		
		String msg = "Your payment of INR " + amount + "by Cash" + description + " recieved.";
		
		double discount = amount * .05 ;
		
		StringBuffer buffer = new StringBuffer(msg);
		
		buffer.append("You get a discount of Rs. " + discount);
		double total = amount - discount;
		buffer.append(" You paid: " + total);
		
		return buffer.toString();
	}

}
