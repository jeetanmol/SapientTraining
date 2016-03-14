package creat.pattern.prototype;

public class Client {

	public static void main(String[] args) {
		
		Employee org = new Employee(101,"Anmol");
		
		System.out.println("Original: " + org);
		Employee proto = null;
		
		try {
			proto = (Employee) org.clone();
			proto.setEmployeeName("Ms." + proto.getEmployeeName());
			System.out.println("Prototype: " + proto);
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Original: " + org);
		System.out.println("Prototype: " + proto);
		

	}

}
