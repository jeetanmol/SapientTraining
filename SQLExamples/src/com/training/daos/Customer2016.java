package com.training.daos;

public class Customer2016 {
    private int customerId;
    private String customerName;
    private String email_Id;
    private long handPhone;
    
    
    
	public Customer2016(int customerId, String customerName, String email_Id, long handPhone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email_Id = email_Id;
		this.handPhone = handPhone;
	}
	public Customer2016() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	public long getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	

    public String showCustomer2016(){
    	String cust=customerId +":"+customerName+":" + email_Id +":"+ handPhone;
    	
    	return cust;
    	
    }
    
}
