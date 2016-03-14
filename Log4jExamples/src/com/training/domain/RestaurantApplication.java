package com.training.domain;

import java.util.ArrayList;

import org.apache.log4j.Logger;


public class RestaurantApplication {

	public static void main(String[] args) {

		Logger logger = Logger.getRootLogger();
		logger.info("Application Started");
		
		Restaurant restaurant = new Restaurant();
		ArrayList<FoodItem> vegList = (ArrayList<FoodItem>)restaurant.getItems("veg");


		vegList.forEach(System.out::println);

	}

}
