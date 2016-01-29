package com.training.apps;

/**
 * 
 * @author avirk
 * @version 1.0
 * 
 */
import java.util.Scanner;

import com.training.domains.NewShowroom;
import com.training.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		
		
		NewShowroom showRoom = new NewShowroom();
		Automobile auto = null;
		int key = 1;
		
		auto = showRoom.getItem(key);
		showRoom.printQuote(auto);
		
		Scanner scn = new Scanner(System.in);
		while(key != 5){
			System.out.println("Choice: 1 Passenger Car 2 Luxury Car 3 Sports Car 4 Bike 5 Exit");
			System.out.println("Enter your choice:");
			key = scn.nextInt();
			auto = showRoom.getItem(key);
			
			if(auto == null)
			{
				continue;
			}
			showRoom.printQuote(auto);
			
		}
		scn.close();
	}
	

}
