package com.training;

public class UsePrintString implements Runnable {
	
	private String s1;
	private String s2;
	
	
	
	public UsePrintString(String s1, String s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		
		Thread t = new Thread(this);
		t.start();
	}



	@Override
	public void run() {
		PrintString.print(s1,s2);

	}

	

}
