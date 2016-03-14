package behave.pattern.strategy;

public class CardPayment implements PaymentStrategy {

	@Override
	public String pay(double amount, String description) {
		
		String msg = "Your Payment of INR " + amount + " by card " + description + " received.";
		StringBuffer buffer = new StringBuffer(msg);
		
		double proceFee = amount * 0.012;
		buffer.append(" Processing fee of Rs. " + proceFee + " is chargeable");
		double total = amount + proceFee;
		buffer.append(" You paid: " + total);
		return buffer.toString();
	}

}
