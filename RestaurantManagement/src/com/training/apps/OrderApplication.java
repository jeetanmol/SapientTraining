package com.training.apps;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;

import com.training.daos.DishDOA;
import com.training.daos.EmployeeDAO;
import com.training.daos.OrderDAO;
import com.training.daos.OrderDetailsDAO;
import com.training.daos.TableDAO;
import com.training.domains.Dish;
import com.training.domains.Employee;
import com.training.domains.Order;
import com.training.domains.OrderDetails;
import com.training.domains.Table;
import com.training.utils.WaiterFunctions;

public class OrderApplication {
	
	public static void main(String[] args) {
		
		Order newOrder,appendOrder;
		OrderDetails orderDetails;
		TableDAO tableDAO = null;
		OrderDAO orderDAO;
		OrderDetailsDAO out;
		DishDOA dishDOA;
		Table table;
		EmployeeDAO employeeDAO;
		Employee employee;
		Scanner scn = new Scanner(System.in);
		int key,choice=1;;
		int waiterId,tableNo;
		
		
		
		while(choice !=3){
		System.out.println("Enter User: 1.Manager  2.Waiter  3.Chef");
		key = scn.nextInt();
		switch (key) {
		case 1:
			choice = 1;
			while(choice !=2){
			System.out.println("Enter choice: 1. Enter waiter-table info  2. exit");
			choice = scn.nextInt();
			switch(choice){
			case 1: 
				System.out.println("Enter Waiter ID:");
				waiterId = scn.nextInt();
				System.out.println("Enter Table no:");
				tableNo = scn.nextInt();
				employeeDAO = new EmployeeDAO();
				employee = new Employee();
				employee = employeeDAO.find(waiterId);
				if(employee.getRole().equals("waiter")){
				table = new Table(employee, tableNo);
				tableDAO = new TableDAO();
				
				System.out.println(tableDAO.add(table) + " waiter table added");
				}
				else
				System.out.println("You have entered wrong Waiter Id");
				break;
			case 2:
				choice= 2;
			}
			}
			break;
			
		case 2:
			choice = 0;
			while(choice!=5){
				System.out.println("Enter choice: 1. Add Order 2.Append Order 3.Check Status 4.exit");
				choice = scn.nextInt();
				switch(choice) {
				case 1:
					
					tableDAO = new TableDAO();
					orderDAO = new OrderDAO();
					
					System.out.println("Enter Order Details:");
					System.out.println("Order Id:");
					int orderId = scn.nextInt();
					System.out.println("Table no.");
					int tableNo1 = scn.nextInt();
					table = tableDAO.find(tableNo1);
					System.out.println("No of diner:");
					int numberOfDiners = scn.nextInt();
					
					newOrder = new Order(orderId, table, numberOfDiners);
					orderDAO.add(newOrder);
					
				case 2:
					dishDOA = new DishDOA();
					orderDAO = new OrderDAO();
					out = new OrderDetailsDAO();
					
					
					System.out.println("Enter details of order:");
					System.out.println("Order Id:");
					int orderId1 = scn.nextInt();
					System.out.println("Dish Id:");
					int dishId = scn.nextInt();
					System.out.println("Quantity:");
					int quantity = scn.nextInt();
					Timestamp time = new Timestamp(System.currentTimeMillis());
					if(WaiterFunctions.checkAvailability(dishId)){
					Dish dish = dishDOA.find(dishId);
					appendOrder = orderDAO.find(orderId1);
					
					orderDetails = new OrderDetails(appendOrder, dish, quantity, time, "pending");
					out.add(orderDetails);
					
					}
					else
						System.out.println("Dish is not available");
					break;
					
				case 3:
					
					
					out = new OrderDetailsDAO();
					ArrayList<OrderDetails> orderDetailsList = new ArrayList<OrderDetails>();
					
					System.out.println("Enter order Id:");
					int orderId2 = scn.nextInt();
					orderDetailsList = (ArrayList<OrderDetails>) out.findAll(orderId2);
					for (OrderDetails orderDetails3 : orderDetailsList) {
						System.out.println(orderDetails3);
					}
					break;
					
				case 4:
					choice = 4;
					break;
					
				default:
					System.out.println("Entered wrong choice");
					break;
				}
				
			}
			break;
		case 3:
			choice=3;
		default:
			break;
		}
		
	}
		
	}
}

