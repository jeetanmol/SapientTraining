package com.training.apps;

import java.util.Scanner;

import com.training.maps.ManagerEmployee;



public class ManagerApplication {

public static void main(String[] args) {
		
		String manager;
		
		ManagerEmployee managerEmployee = new ManagerEmployee();
		
		System.out.println("Enter the  Manager you need to find : ");
		
		Scanner scn = new Scanner(System.in);
		
		manager = scn.next();
		
		System.out.println(managerEmployee.getEmployee(manager));
		
		managerEmployee.printEmployees();
		scn.close();
		
	}
}
