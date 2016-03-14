package creat.pattern.prototype;

public class Employee implements Cloneable {
	
	private int employeeId;
	private  String employeeName;
		
	
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}




	public int getEmployeeId() {
		return employeeId;
	}




	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}




	public String getEmployeeName() {
		return employeeName;
	}




	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}




	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}




	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

	
	
	
}
