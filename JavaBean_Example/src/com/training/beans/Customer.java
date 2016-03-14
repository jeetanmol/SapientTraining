package com.training.beans;

import java.io.Serializable;
import java.util.logging.*;
public class Customer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long customerId;
	private String customerName;
    private String emailId;
    private long handPhone;
    
    Logger log = Logger.getLogger(this.getClass().getName());
    
    public Customer() {
		super();
		log.info("Customer has been initialized");
		// TODO Auto-generated constructor stub
	}
    
    
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
		log.info("Customer id has been set ");
	}
	public String getCustomerName() {
		log.info("GetCustomer Name has been called ");
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmail_Id(String emailId) {
		this.emailId = emailId;
	}
	public long getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	
	public String getInfo(){
		
		return "Message from Bean";
	}

}
