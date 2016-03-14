package com.training.domains;

import org.springframework.stereotype.Component;

@Component("cust")
public class Customer {
	
	private int customerId;
	private String customerName;
	private long handPhone;
	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, long handPhone, String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.handPhone = handPhone;
		this.email = email;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", handPhone=" + handPhone
				+ ", email=" + email + "]";
	}
	
	
	
	

}
