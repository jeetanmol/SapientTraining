package com.training.daos;

import java.util.List;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.domains.Invoice;
import com.training.ifaces.MyDAO;


public class InvoiceDAO extends JdbcDaoSupport implements MyDAO<Invoice> {

	@Override
	public boolean Add(Invoice t) {
		
		boolean result = false;
		String sql="Insert into Invoice2016 values (?,?,?)";
		
		int rowInserted = getJdbcTemplate().update(sql,t.getInvoiceNo(),t.getCustomerName(),t.getAmount());
		
		if(rowInserted > 0){
			result = true;
		}
		
			return result;
	}

	@Override
	public Invoice find(int key) {
		
		String sql = "Select * from Invoice2016 where invoiceno = ? ";
		
		Invoice inv = getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<Invoice>(Invoice.class),key);
		
		
		return inv;
	}

	@Override
	public List<Invoice> findAll() {
		String sql = "Select * from Invoice2016";
		List<Invoice> invList = 
		getJdbcTemplate().query(sql,new BeanPropertyRowMapper<Invoice>(Invoice.class));
		return invList;
	}



}
