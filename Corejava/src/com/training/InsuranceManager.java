package com.training;

public class InsuranceManager {
	
	public static void printPremium(LifeInsurance[] policies){
		
		for(LifeInsurance ins: policies)
		{
			System.out.println(ins);
			System.out.println("Premium is : " + ins.calculatePremium());
		}
		
	}

}
