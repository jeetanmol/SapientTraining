package com.training.domains;

public class Address {
	
	private int houseNo;
	private String city;
	private String state;
	private int pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	public Address(int houseNo, String city, String state, int pincode) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	

}
