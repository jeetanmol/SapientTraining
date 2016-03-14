package struct.pattern.proxy;

public class CalculateBeanImpl implements CalculateBean {

	@Override
	public double square(double number) {
		
		return number * number;
	}

}
