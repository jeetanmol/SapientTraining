package com.training.exercise1;

import java.util.Scanner;

/**
 * 
 * @author avirk
 *
 */
public class TaxApplication {

	public static void main(String[] args) {
		
		TaxWhiz tax = new  TaxWhiz(5);
		
		// Ask user to enter the the purchase
		System.out.println("Enter your purchase: ");
		
		Scanner scn = new Scanner(System.in);
		double purchase1 = scn.nextDouble();
		System.out.println("The tax on your purchase is : " + tax.calcTax(purchase1));
		scn.close();

	}

}
