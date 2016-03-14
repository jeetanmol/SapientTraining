package com.training.apps;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Invoice;

public class CollectionItem {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Coll_Injec.xml");
		
		Invoice inv = ctx.getBean(Invoice.class);
		
		System.out.println(inv);
		ctx.close();
		
		

	}

}
