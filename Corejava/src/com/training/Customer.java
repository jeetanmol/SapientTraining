package com.training;

public class Customer {
	
	private int customerId;
	private String customerName;
	
	


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int customerId, String customerName) {
		super();
		customerId = customerId;
		customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		customerName = customerName;
	}
	
	

}
