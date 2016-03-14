package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.samples.CurrencyConvertor;

public class FirstTestCase {

	CurrencyConvertor conv = null;
	@Before
	public void setUp() throws Exception {
		
		System.out.println("Before calling");
		conv = new CurrencyConvertor();
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("After Called");
	}

	@Test
	public void test1() {
		
		
		double actual = conv.dollarToRupees(10);
		
		assertEquals(1000.0, actual,12);
		//fail("Not yet implemented");
	}

	@Test
	public void test2(){
		
		Double actual = conv.dollarToRupees(10);
		
		assertNotNull(actual);
		//fail("Not yet implemented");
	}
}
