package com.training.apps;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.CustomerDAO;
import com.training.daos.ItemDAO;
import com.training.daos.ServiceDAO;
import com.training.domains.Customer;
import com.training.domains.Item;
import com.training.domains.Service;

public class ServiceCenterApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		CustomerDAO customerDAO = ctx.getBean(CustomerDAO.class);
		ItemDAO itemDAO = ctx.getBean(ItemDAO.class);
		ServiceDAO serviceDAO = ctx.getBean(ServiceDAO.class);
		
		/*Customer cust1= ctx.getBean(Customer.class);
		
		cust1.setCustomerId(101);
		cust1.setCustomerName("Anmol");
		cust1.setHandPhone(989898898);
		cust1.setEmail("anmol.gmail.com");
		
		System.out.println(customerDAO.Add(cust1) + " row added");
		
		Item item1 = ctx.getBean(Item.class);
		
		item1.setItemId(201);
		item1.setItemName("Dell Inspiron N5010");
		item1.setItemType("Laptop");
		
		System.out.println(itemDAO.Add(item1) + " row added") ;
		Service serv1= ctx.getBean(Service.class);
		
		serv1.setServiceId(1);
		serv1.setProbDesc("Battery Problem");
		serv1.setCustomer(cust1);
		serv1.setItem(item1);
		
		System.out.println(serviceDAO.Add(serv1) + " row added ");*/
		
		Customer cust2 = ctx.getBean(Customer.class);
		
		cust2 = customerDAO.find(101);
		
		System.out.println(cust2);
		
		Item item2 = ctx.getBean(Item.class);
		
		item2 = itemDAO.find(201);
		
		System.out.println(item2);
		
		Service serv2= ctx.getBean(Service.class);
		
		serv2 = serviceDAO.find(1);
		
		System.out.println(serv2);
		
		ctx.close();
				
		
		

	}

}
