package com.training.domains;

import java.util.List;

public class Invoice {

	private int invoiceNo;
	private double billAmount;
	
	private Customer cust;
	private List<Item> itemList;

	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public List<Item> getItemList() {
		return itemList;
	}



	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}



	public Invoice(int invoiceNo, double billAmount, Customer cust, List<Item> itemList) {
		super();
		this.invoiceNo = invoiceNo;
		this.billAmount = billAmount;
		this.cust = cust;
		this.itemList = itemList;
	}



	public int getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	

	@Override
	public String toString() {
		return "Invoice [invoiceNo=" + invoiceNo + ", billAmount=" + billAmount + ", cust=" + cust + ", itemList="
				+ itemList + "\n";
	}

	
	
}
