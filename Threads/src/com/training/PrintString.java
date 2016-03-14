package com.training;

public class PrintString {
	
	public synchronized static void print(String s1, String s2){
		
		System.out.println(s1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s2);
		
	}

}
