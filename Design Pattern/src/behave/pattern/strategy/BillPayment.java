package behave.pattern.strategy;

public class BillPayment {
	
	PaymentStrategy payment;
	
	
	public PaymentStrategy getPayment() {
		return payment;
	}


	public void setPayment(PaymentStrategy payment) {
		this.payment = payment;
	}


	public BillPayment(PaymentStrategy payment) {
		super();
		this.payment = payment;
	}


	public String makePayment(double amount, String description){
		return payment.pay(amount, description);
	}

}
