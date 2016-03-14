package struct.pattern.facade;

public class HotelDetails implements Reservation{

	public String tajDetails(){
		
		return "TAJ: 40 rooms";
		
	}
	
	public String marriottDetails(){
		return "Marriott: 30 rooms";
	}

	@Override
	public void dislay() {
		System.out.println(tajDetails());
		System.out.println(marriottDetails());
		
	}
}
