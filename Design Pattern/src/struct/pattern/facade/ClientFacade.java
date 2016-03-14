package struct.pattern.facade;

public class ClientFacade {

	public static void main(String[] args) {
		
		ReservationFacade fac = new ReservationFacade();
		fac.getflightDetails().dislay();
		fac.gethotelDetails().dislay();
	}

	
	
}
