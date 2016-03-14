package com.training;

public class InsuranceManagerAplication {
	
	public static void main(String[] args){
	
		LifeInsurance ins1 = new LifeInsurance(101, "ramesh", "QTR", 20000);
		LifeInsurance ins2 = new LifeInsurance(102, "rajesh", "HLF", 30000);
		LifeInsurance ins3 = new LifeInsurance(103, "rakesh", "QTR", 40000);
		LifeInsurance ins4 = new LifeInsurance(104, "rabesh", "YR", 50000);
		
		LifeInsurance[] list = new LifeInsurance[4];
		
		list[0] = ins1;
		list[1] = ins2;
		list[2] = ins3;
		list[3] = ins4;
		
		//InsuranceManager man =  new InsuranceManager();
		//man.printPremium(list);
		
		InsuranceManager.printPremium(list);
	}

}
