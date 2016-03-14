package com.training.entity;




import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
public class TravelRequest {
	
	@NotEmpty
	private String customerName;
	
	@Max(99999L)
	@Min(10000L)
	private long phone;
	
	@Email
	private String email;
	private String carType;
	public TravelRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TravelRequest(String customerName, long phone, String email, String carType) {
		super();
		this.customerName = customerName;
		this.phone = phone;
		this.email = email;
		this.carType = carType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	@Override
	public String toString() {
		return "CarRental [customerName=" + customerName + ", phone=" + phone + ", email=" + email + ", carType="
				+ carType + "]";
	}
	
	

}
