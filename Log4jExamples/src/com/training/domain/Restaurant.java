package com.training.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

public class Restaurant {
	
	private List<FoodItem> items;
	
	Logger logger = Logger.getRootLogger();
	
	
	public Restaurant(){
		items = new ArrayList<FoodItem>();
		init();
	}
	
	public void init(){
		FoodItem f1 = new FoodItem(101, "Burger", 70, true);
		FoodItem f2 = new FoodItem(102, "Pasta", 200, true);
		FoodItem f3 = new FoodItem(103, "Cold Coffee", 50, true);
		FoodItem f4 = new FoodItem(104, "Chicken Tikka", 150, false);
		FoodItem f5 = new FoodItem(105, "Chicken Briyani", 130, false);
		FoodItem f6 = new FoodItem(106, "Lamb chops", 200, false);
		FoodItem f7 = new FoodItem(107, "Brownie", 50, true);
		FoodItem f8 = new FoodItem(108, "Choc Pastry", 70, true);
		items.add(f1);
		items.add(f2);
		items.add(f3);
		items.add(f4);
		items.add(f5);
		items.add(f6);
		items.add(f7);
		items.add(f8);
		logger.info("Food Items added to the menu card");
		
		
	}
	
	public List<FoodItem> getItems(String Type){
		
		List<FoodItem> typeList = new ArrayList<FoodItem>();
		Iterator<FoodItem> i = items.iterator();
		while(i.hasNext()){
			FoodItem f = i.next();
			if(Type.equals("veg") && f.isVegetarian() == true){
				typeList.add(f);
			}
			if(Type.equals("nonveg") && f.isVegetarian() == false){
				typeList.add(f);
			}
		}
		
		return typeList;
	}
	
	
	
	public List<FoodItem> getMenuCard(){
		
		return items;
	}

}
