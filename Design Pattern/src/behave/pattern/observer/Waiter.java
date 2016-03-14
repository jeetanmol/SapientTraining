package behave.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Waiter implements Observer {

	@Override
	public void update(Observable o, Object arg1) {
		
		String msg = null;
		if(o instanceof MealOrder)
		{
			 msg = (String)arg1;
		}

		if(msg.equals("Accepted")){
			
			System.out.println("Order has been accepted");
			
		}
		else if(msg.equals("Pending")){
			
			System.out.println("Order is pending");
		}
		else if(msg.equals("Completed")){
			
			System.out.println("Your ordered has been completed. Collect it!!");
		}
	}

}
