package com.training;

public class Application2 {

	public static void main(String[] args){
		
		YourThread obj = new YourThread();
		
		Thread t1 = new Thread(obj,"Ram");
		Thread t2 = new Thread(obj,"Sham");
		Thread t3 = new Thread(obj,"Nam");
		t1.start();
		t2.start();
		t3.start();
		
	}
}
