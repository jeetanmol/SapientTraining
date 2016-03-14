package com.training.domains;

public class Employee {
	
	private int Employee_Id;
	private String Employee_Name;
	private long PhoneNumber;
	private String Role;
	private double Salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employee_Id, String employee_Name, long phoneNumber, String role, double salary) {
		super();
		Employee_Id = employee_Id;
		Employee_Name = employee_Name;
		PhoneNumber = phoneNumber;
		Role = role;
		Salary = salary;
	}

	public int getEmployee_Id() {
		return Employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}

	public String getEmployee_Name() {
		return Employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}

	public long getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee : Employee_Id=" + Employee_Id + ", Employee_Name=" + Employee_Name + ", PhoneNumber="
				+ PhoneNumber + ", Role=" + Role + ", Salary=" + Salary ;
	}
	
	

}
