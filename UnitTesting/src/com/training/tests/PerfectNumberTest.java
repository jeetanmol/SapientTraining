package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PerfectNumberTest {

	PerfectNumber num;
	@Before
	public void setUp() throws Exception {
		num = new PerfectNumber(-20);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNumberIsPositive() {
		 num.getPerfectNumber();
		
		
	}
	
	@Test
	public void testResultTrue(){
		
		boolean result = num.isPerfectNumber();
		assertTrue("No is not a perfect Number",result);
		 
	}
	
	@Test
	public void TestResultFalse(){
		
		boolean result = num.isPerfectNumber();
		assertFalse("No is a perfect Number",result);
	}
}
