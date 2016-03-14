package com.training.domain;

import org.apache.log4j.Logger;

public class FoodItem {

	private int itemCode;
	private String itemName;
	private double ratePerUnit;
	private boolean isVegetarian;
	
	Logger logger = Logger.getLogger(this.getClass());
	
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
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
	public boolean isVegetarian() {
		return isVegetarian;
	}
	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	public FoodItem(int itemCode, String itemName, double ratePerUnit, boolean isVegetarian) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.ratePerUnit = ratePerUnit;
		this.isVegetarian = isVegetarian;
		
		logger.info("Food Item initialized");
	}
	@Override
	public String toString() {
		return "FoodItem : itemCode=" + itemCode + ", itemName=" + itemName + ", ratePerUnit=" + ratePerUnit
				+ ", isVegetarian=" + isVegetarian ;
	}
	
	
}
