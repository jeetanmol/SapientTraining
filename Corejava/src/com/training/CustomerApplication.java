package com.training;

public class CustomerApplication {
	public static void main(String[] args){
		Customer2016 cust1=new Customer2016();
		cust1.setCustomerId(101);
		cust1.setCustomerName("Ramesh");
		cust1.setEmail_Id("ram@abc.com");
		cust1.setHandPhone(3895789);
		
		System.out.println(cust1.showCustomer2016());
		Customer2016 cust2= new Customer2016(102,"rajan","raj@abc.com",8979);
		System.out.println(cust2.showCustomer2016());
	}
}
