package struct.pattern.proxy;

public class CalculateBeanProxy implements CalculateBean {
	
	private CalculateBean realobj;
	
	

	@Override
	public double square(double number) {
		realobj = new CalculateBeanImpl();
		return realobj.square(number);
	}

}
