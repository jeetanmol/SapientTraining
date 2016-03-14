package com.training.domains;

import java.sql.Timestamp;

public class OrderDetails {
	
	private Order order;
	private Dish dish;
	private int quantity;
	private Timestamp orderTime;
	private String status;
	
 
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public OrderDetails(Order order, Dish dish, int quantity, Timestamp orderTime, String status) {
		super();
		this.order = order;
		this.dish = dish;
		this.quantity = quantity;
		this.orderTime = orderTime;
		this.status = status;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public Dish getDish() {
		return dish;
	}


	public void setDish(Dish dish) {
		this.dish = dish;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Timestamp getOrderTime() {
		return orderTime;
	}


	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "OrderDetails order=" + order + ", dish=" + dish + ", quantity=" + quantity + ", orderTime=" + orderTime
				+ ", status=" + status ;
	}
	
	
	
	
	
	
	
	

}
