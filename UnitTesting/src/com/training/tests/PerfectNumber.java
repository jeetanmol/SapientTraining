package com.training.tests;

public class PerfectNumber {
	
	public int perfectNumber;
	
	
	public int getPerfectNumber() {
		return perfectNumber;
	}


	public void setPerfectNumber(int perfectNumber) {
		/*if(perfectNumber <0){
			throw new  Exception();
		}*/
		this.perfectNumber = perfectNumber;
	}


	public PerfectNumber(int perfectNumber) {
		super();
		this.perfectNumber = perfectNumber;
	}


	public boolean isPerfectNumber(){
		
		
		int temp = 0;
		for(int i=1;i<=perfectNumber/2;i++){
			
			if(perfectNumber%i == 0){
				temp += i;
			}
		}
		
		if(temp == perfectNumber)
		return true;
		else
			return false;
	}

}
