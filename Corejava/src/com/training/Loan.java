package com.training;

public class Loan {
	
	private long loanId;
	private int customerId;
	private String loanType;
	protected double loanAmt;
	
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(long loanId, int customerId, String loanType) {
		super();
		this.loanId = loanId;
		this.customerId = customerId;
		this.loanType = loanType;
		
	}

	public long getLoanId() {
		return loanId;
	}

	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	
	
	}
	
	
	
	
	

}
