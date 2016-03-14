package com.training;



import java.util.Scanner;

public class InsuranceApplication {

	public static void main(String[] args) {
		
		
		
		LifeInsurance life = new LifeInsurance();
		
		//Instance variable has default value 
		System.out.println("The Premium calculated is " + life.calculatePremium());
		
		
		LifeInsurance life1 = new LifeInsurance();
		
		life1.setPolicyNumber(1001);
		life1.setPolicyAmount(120000.67);
		life1.setPaymentMode("Quaterly");
		life1.setPolicyHolderName("Ramesh");
		
		System.out.println("The Premium calculated is " + life1.calculatePremium());
		
		
		
		//Using parameterized constructor
		LifeInsurance life2 = new LifeInsurance(1002,"Rajesh","yearly",200000);
		
		System.out.println("The Premium calculated is " + life2.calculatePremium());
		
		
		//Using Wrapper CLass
		
		long policyNumber = Long.parseLong(args[0]);
		double policyAmount = Double.parseDouble(args[3]);
		
		
		
		//Command line Arguments
		
		LifeInsurance life3 = new LifeInsurance(policyNumber,args[1],args[2],policyAmount);
		
		System.out.println("The Premium calculated is " + life3.calculatePremium());
		System.out.println(life3.getPaymentMode());
		
		
		
		//Using Scanner class
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter policy Number:");
		long policyNum = scn.nextLong();
		
		System.out.println("Enter policy Holder Name:");
		String policyHolderName = scn.next();
		
		System.out.println("Enter policy Mode:");
		String paymentMode = scn.next();
		
		System.out.println("Enter policy Amount:");
		double policyAmt = scn.nextDouble();
		
		LifeInsurance life5 = new LifeInsurance(policyNum, policyHolderName, paymentMode, policyAmt);
		
		System.out.println(life5.calculatePremium());
		
		scn.close();
		
		LifeInsurance life6 = new LifeInsurance();
		
		//using the overloaded method
		System.out.println(life6.calculatePremium(1000000));
		
		
		

	}

}
