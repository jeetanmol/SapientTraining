package com.training.exercise3;

import java.util.Scanner;

public class RentApplication {

	public static void main(String[] args) {
		
		
		int days;
		int items;
		int key;
		int serial;
		double r;
		String result = "";
		Double amount = 0.0;
		Scanner s = new Scanner(System.in);
		do{
			
			System.out.println("Enter the item you want the rent for: \n 1. Fan \n 2. Air Conditioner \n 3. Furniture \n 4. Vessel\n 5. Total Amount ");
			key = s.nextInt();
			if(key == 5){
				System.out.println("Serial  Days  Items  Amount");
				System.out.println(result);
				System.out.println("\nTotal Amount is: " + amount);
				System.exit(0);
			}
			System.out.println("Enter the no of days you want the item for:");
			days = s.nextInt();
			System.out.println("Enter the no of item you want: ");
			items = s.nextInt();
			
			switch (key) {
			case 1:
				System.out.println("Enter the type of fan you want:\n 1. Table Fan \n 2. Standing Fan \n 3.Ceiling Fan");
				
				Fan f = new Fan(days,items);
				f.setSerialId(s.nextInt());
				r = f.calRent();
				serial= f.getSerialId();
				
				result +=   serial + "  " + days + "  " + items + "  " + r + "\n";
				System.out.println("Amount:" + r);
				amount = amount + r;				
				
				
				break;
			case 2:
				System.out.println("Enter the type of air conditioner you want:\n 1. Split ac \n 2. Window \n 3.Standing");
				
				AirConditioner a = new AirConditioner(days,items);
				
				a.setSerialId(s.nextInt());
				r= a.calRent();
				serial= a.getSerialId();
				
				result +=   serial + "  " + days + "  " + items + "  " + r + "\n";
				System.out.println("Amount:" + r);
				amount = amount + r;
				
				
				
				break;
			case 3:
				System.out.println("Enter the type of furniture  you want:\n 1. Split ac \n 2. Window \n 3.Standing");
				
				Furniture f1 = new Furniture(days,items);
				
				f1.setSerialId(s.nextInt());
				r = f1.calRent();
				serial= f1.getSerialId();
				
				result +=   serial + "  " + days + "  " + items + "  " + r + "\n";
				System.out.println("Amount:" + r);
				amount = amount + r;
				

				
				break;
			case 4:
				System.out.println("Enter the type of vessel  you want:\n 1. Plates ac \n 2. Glassess \n 3.Spoons");
				
				Vessel v = new Vessel(days,items);
				
				v.setSerialId(s.nextInt());
				r = v.calRent();
				serial= v.getSerialId();
				
				result +=   serial + "  " + days + "  " + items + "  " + r + "\n";
				System.out.println("Amount:" + r);
				amount = amount + r;
				
				
				break;
			
				
	
				
			default:
				System.out.println("Wrong Choice");
			}
			
			
		}while(true);
		

}
}
