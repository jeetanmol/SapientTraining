package com.training.domains;

public class Table {
	private Employee employee;
	private int tableNo;
	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Table(Employee employee, int tableNo) {
		super();
		this.employee = employee;
		this.tableNo = tableNo;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getTableNo() {
		return tableNo;
	}
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}
	@Override
	public String toString() {
		return "Table employee=" + employee + ", tableNo=" + tableNo ;
	}
	

}
