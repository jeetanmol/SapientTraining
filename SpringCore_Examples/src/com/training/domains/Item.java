package com.training.domains;

public class Item {
	
	private int itemNo;
	private String itemName;
	private double ratePerUnit;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Item(int itemNo, String itemName, double ratePerUnit) {
		super();
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.ratePerUnit = ratePerUnit;
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	@Override
	public String toString() {
		return "Item: itemNo=" + itemNo + ", itemName=" + itemName + ", ratePerUnit=" + ratePerUnit + "\n";
	}
	
	

}
