package struct.pattern.facade;

public class ReservationFacade {
	
	public FlightDetails getflightDetails(){
		
		FlightDetails flight = new FlightDetails();
		return flight;
	}

	public HotelDetails gethotelDetails(){
		
		HotelDetails hotel = new HotelDetails();
		return hotel;
	}
}
