package com.training.apps;

import java.util.ArrayList;


import com.training.daos.EmployeeDAO;
import com.training.daos.UserDAO;
import com.training.domains.Employee;
import com.training.domains.User;
import com.training.utils.ValidateUser;

public class Application {

	public static void main(String[] args) {
		
		EmployeeDAO employee = new EmployeeDAO();
		UserDAO user = new UserDAO();
		ValidateUser validateUser =  new ValidateUser() ;
		ArrayList<Employee> employeeList;
		
		
		Employee emp1 = new Employee(101, "Anmoljeet", 98756432, "manager",60000);
		
		Employee emp2 = new Employee(201, "Rakesh", 12345678, "waiter", 8000);
		Employee emp3 = new Employee(202, "Rajesh", 92345678, "waiter", 8000);
		Employee emp4 = new Employee(301, "Rupesh", 54545454, "chef", 50000);
		User u1 = new User(emp1.getEmployee_Id(), "virkanmol");
		User u2 = new User(emp2.getEmployee_Id(), "virkanmol1");
		User u3 = new User(emp3.getEmployee_Id(), "virkanmol2");
		User u4 = new User(emp4.getEmployee_Id(), "virkanmol3");
		
		
		
		
		System.out.println(employee.add(emp1) + " employee added");
		System.out.println(employee.add(emp2) + " employee added");
		System.out.println(employee.add(emp3) + " employee added");
		System.out.println(employee.add(emp4) + " employee added");
		
		employeeList = (ArrayList<Employee>) employee.findAll();
		System.out.println("Details of employees are: ");
		
		for (Employee employee2 : employeeList) {
			
			System.out.println(employee2);
			
		}
		
		;
		System.out.println(user.add(u1) + "user added");
		System.out.println(user.add(u2) + "user added");
		System.out.println(user.add(u3) + "user added");
		System.out.println(user.add(u4) + "user added");
		
		if(validateUser.validate(u1))
		{
			System.out.println("Entered details are valid");
		}
		else
			System.out.println("Credentials added are wrong");
		
		
		
		

	}

}
