package com.training.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;

import com.training.daos.CustomerDAO;
import com.training.daos.ItemDAO;
import com.training.domains.Customer;
import com.training.domains.Item;
import com.training.domains.Service;

public class ServiceRowMapper implements RowMapper<Service> {

	@Override
	public Service mapRow(ResultSet rs, int arg1) throws SQLException {
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		Service service = ctx.getBean(Service.class);
		CustomerDAO customerDAO = ctx.getBean(CustomerDAO.class);
		ItemDAO itemDAO = ctx.getBean(ItemDAO.class);
		
		service.setServiceId(rs.getInt("serviceid"));
		service.setProbDesc(rs.getString("probdesc"));
		
		Customer cust = customerDAO.find(rs.getInt("customerid"));
		service.setCustomer(cust);
		
		Item item = itemDAO.find(rs.getInt("itemid"));
		service.setItem(item);
		
		return service;
	}

}
