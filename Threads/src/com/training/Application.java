package com.training;

public class Application {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		Thread thread = new MyThread();
		thread.setName("First Thread");
		
		thread.start();
		

	}

}
