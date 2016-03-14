package com.training.domains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("service")
public class Service {
	
	private int serviceId;
	private String probDesc;
	
	@Autowired
	private Customer customer;
	
	@Autowired
	private Item item;

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getProbDesc() {
		return probDesc;
	}

	public void setProbDesc(String probDesc) {
		this.probDesc = probDesc;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Service [serviceId=" + serviceId + ", probDesc=" + probDesc + ", customer=" + customer + ", item="
				+ item + "]";
	}
	

	
	 

}
