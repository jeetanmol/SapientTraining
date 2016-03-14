package com.training;

public class RangeCheckException extends Exception{
	
	private long handPhone;

	public RangeCheckException(long handPhone) {
		// TODO Auto-generated constructor stub
		super();
		this.handPhone = handPhone;
		
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
	
}
