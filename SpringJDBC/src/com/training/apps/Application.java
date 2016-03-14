package com.training.apps;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.InvoiceDAO;
import com.training.domains.Invoice;

public class Application {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		InvoiceDAO obj = ctx.getBean("dao",InvoiceDAO.class);
		
		Invoice inv2 = ctx.getBean("invoice",Invoice.class);
		
		inv2.setInvoiceNo(102);
		inv2.setCustomerName("Nikita");
		inv2.setAmount(5200.00);
		
		boolean result = obj.Add(inv2);
		System.out.println( " row added " + result);
		
		List<Invoice> inv = obj.findAll();
		System.out.println(inv);
		ctx.close();
	}

}
