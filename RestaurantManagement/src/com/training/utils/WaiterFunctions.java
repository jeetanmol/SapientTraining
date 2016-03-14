package com.training.utils;

import com.training.daos.DishDOA;
import com.training.domains.Dish;

public class WaiterFunctions {
	
	public static boolean checkAvailability(int dishId){
		
		DishDOA dishDOA = new DishDOA();
		
		Dish dish = new  Dish();
		dish = dishDOA.find(dishId);
		if(dish.getAvailabilty().equals("yes")){
			return true;
		}
		else
			return false;
	}

	public static void newOrder(){
		
	
		
	}
	
	public static void appendOrder(){
		
	}
}
