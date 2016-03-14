package com.training.daos;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.domains.Customer;
import com.training.ifaces.DAO;

public class CustomerDAO extends JdbcDaoSupport implements DAO<Customer>  {

	@Override
	public boolean Add(Customer t) {
		
		
		boolean result = false;
		String sql = "Insert into customer values (?,?,?,?)";
		
		int rowInserted = getJdbcTemplate().update(sql,t.getCustomerId(),t.getCustomerName(),t.getHandPhone(),t.getEmail());

		if(rowInserted >0){
			
			result = true;
		}
	
		return result;
	}

	@Override
	public Customer find(int key) {
	
		String sql = "Select * from customer where customerid = ?";
		
		Customer cust = getJdbcTemplate().queryForObject(sql,new BeanPropertyRowMapper<Customer>(Customer.class),key);
		
		return cust;
	}

	@Override
	public List<Customer> findAll() {
		
		String sql = "Select * from customer ";
		
		List<Customer> custList = getJdbcTemplate().query(sql,new BeanPropertyRowMapper<Customer>(Customer.class));
		
		return custList;
	}

	

}
