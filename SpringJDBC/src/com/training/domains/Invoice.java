package com.training.domains;

import org.springframework.stereotype.Component;

@Component("invoice")
public class Invoice {
	

	private int invoiceNo;
	private String customerName;
	private double amount;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(int invoiceNo, String customerName, double amount) {
		super();
		this.invoiceNo = invoiceNo;
		this.customerName = customerName;
		this.amount = amount;
	}
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceNo=" + invoiceNo + ", customerName=" + customerName + ", amount=" + amount + "]";
	}
	
}
