package behave.pattern.observer;

public class Client {

	public static void main(String[] args) {
		
		MealOrder order = new MealOrder();
		
		order.addObserver(new Waiter());
		
		order.setStatus("Accepted");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		order.setStatus("Completed");

	}

}
