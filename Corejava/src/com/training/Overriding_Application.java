package com.training;

public class Overriding_Application {

	public final static void main(String[] args) {
		
		LifeInsurance ins = new LifeInsurance(101, "Ramesh", "QTR", 4589562);
		LifeInsurance ins1 = new LifeInsurance(101, "Ramesh", "QTR", 4589562);
		
		LifeInsurance ins2 = ins1;
		LifeInsurance ins3 = null;
		
		System.out.println(ins1.equals(ins2));
		System.out.println(ins1.equals(ins3));
		
		String s = new String("didhd");
		System.out.println(ins.equals(s));
		
		System.out.println(ins.equals(ins1));
		

	}

}

