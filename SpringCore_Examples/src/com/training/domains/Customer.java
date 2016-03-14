package com.training.domains;

import java.util.logging.Logger;

public class Customer {
	
	private int custId;
	private String customerName;
	private long phoneNumber;
	
	private Address adr;
	

	public Customer(int custId, String customerName, long phoneNumber, Address adr) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.adr = adr;
	}
	Logger logger= Logger.getLogger(this.getClass().getName());
	
	public Customer() {
		super();
		logger.info("Customer is Initialized");
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", adr=" + adr + "]";
	}

	public int getCustId() {
		logger.info("Customer Id is get");
		return custId;
	}
	public void setCustId(int custId) {
		logger.info("Customer Id is set");
		this.custId = custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Address getAdr() {
		return adr;
	}


	public void setAdr(Address adr) {
		this.adr = adr;
	}


}
