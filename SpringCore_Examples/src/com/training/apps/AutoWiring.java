package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Invoice;

public class AutoWiring {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AutoWire.xml");
		
		Invoice inv = ctx.getBean(Invoice.class);
		
		System.out.println(inv);
		
	}

}
