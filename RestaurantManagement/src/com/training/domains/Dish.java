package com.training.domains;



public class Dish {
	
	private int dishId;
	private String dishName;
	private double price;
	private int prepTime;
	private String availabilty;
	private String Category;
	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dish(int dishId, String dishName, double price, int prepTime, String availabilty, String category) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.price = price;
		this.prepTime = prepTime;
		this.availabilty = availabilty;
		Category = category;
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPrepTime() {
		return prepTime;
	}
	public void setPrepTime(int prepTime) {
		this.prepTime = prepTime;
	}
	public String getAvailabilty() {
		return availabilty;
	}
	public void setAvailabilty(String availabilty) {
		this.availabilty = availabilty;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	@Override
	public String toString() {
		return "Dish: dishId=" + dishId + ", dishName=" + dishName + ", price=" + price + ", prepTime=" + prepTime
				+ ", availabilty=" + availabilty + ", Category=" + Category;
	}
	

}
