package com.training.samples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BankAccountTest {
	
	BankAccount account1;
	long accountNumber;
	double balance;
	String holderName;
	

	@Before
	public void setUp() throws Exception {
		
		account1 = new BankAccount(101,"Anmol",1100);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = NullPointerException.class)
	public void testConstructorNotNull() {
		
		
		
		
		holderName = account1.getAccountHolderName();
		fail("Accepting Null");
	
		
		
	}
	
	@Test
	public void testConstructorNotNull1(){
		
		try{
			
			holderName = account1.getAccountHolderName();
			fail("Accepting Null");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	@Test
	public void testConstructorReturnValue(){
		
		long actual = account1.getAccountNumber();
		assertEquals(101, actual);
	}
	
	@Test
	public void testDepositDoublePositive(){
		
		double balance = account1.deposit(200);
		assertTrue( balance > 0);
	
	}
	
	@Test
	public void testWithdrawal(){
		
		
		double balance = account1.withdrawal(1000);
		
		assertTrue("Withdrawer amount is more than balance",balance>0);
	}
	
	@Test(timeout = 2000)
	public void testWithrawralIndefinite(){
		
		account1.withdrawal(400);
		fail("Loop still running");
		
		
		
	}
	
	
	
}
