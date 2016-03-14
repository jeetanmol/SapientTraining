package struct.pattern.facade;

public class FlightDetails implements Reservation{

	public String airIndiaDetails(){
		
		return "AI - 26 seats";
	}
	
	public String jetKingDetails(){
		
		return "JK - 34 seats";
	}

	@Override
	public void dislay() {
		System.out.println(airIndiaDetails());
		System.out.println(jetKingDetails());
		
	}
	
}
