package com.training.domains;

public class Order {
	
	private int orderId;
	private Table table;
	private int numberOfDiners;
	public Order(int orderId, Table table, int numberOfDiners) {
		super();
		this.orderId = orderId;
		this.table = table;
		this.numberOfDiners = numberOfDiners;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order OrderId=" + orderId + ", table=" + table + ", numberOfDiners=" + numberOfDiners;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	public int getNumberOfDiners() {
		return numberOfDiners;
	}
	public void setNumberOfDiners(int numberOfDiners) {
		this.numberOfDiners = numberOfDiners;
	}
	
	

}
