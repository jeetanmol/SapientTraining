package com.training.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TestPerfectNumberbyParamters {
	
	private int numbers;
	
	

	public TestPerfectNumberbyParamters(int numbers) {
		super();
		this.numbers = numbers;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPerfectByParams() {
		
		PerfectNumber obj = new PerfectNumber(numbers);
		boolean actual = obj.isPerfectNumber();
		assertTrue(numbers + " is not a Perfect Number", actual);
	}

	@Parameters
	public static Collection<Object[]> data(){
		
		Object[][] data = new Object[][]{ {6} , {27} , {28} , {44} };
		return Arrays.asList(data);
	}
	
}
