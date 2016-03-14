package struct.pattern.proxy;

public class Client {

	public static void main(String[] args) {
		
		CalculateBeanProxy proxy = new CalculateBeanProxy();
		System.out.println(proxy.square(3.5));
	}

}
