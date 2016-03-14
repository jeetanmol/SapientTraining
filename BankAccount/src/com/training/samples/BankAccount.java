package com.training.samples;

public class BankAccount {
	
	private long accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	public BankAccount(long accountNumber, String accountHolderName, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		if(accountHolderName== null){
			throw new NullPointerException();
		}
		this.accountHolderName = accountHolderName;
	}

	@Override
	public String toString() {
		return "BankAccount [AccountNumber=" + accountBalance + ", AccountHolderName=" + accountHolderName
				+ ", AccountBalance=" + accountBalance + "]";
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double deposit(double amountDeposited){
		
		accountBalance = accountBalance + amountDeposited;
		return accountBalance;
		
	}
	
	public double withdrawal(double amountWithdrawed){
		
		accountBalance = accountBalance - amountWithdrawed;
		/*int i = 0;
		boolean con = true;
		while(con){
			 i++;
		}*/
		return accountBalance;
	}

}
