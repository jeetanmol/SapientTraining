package com.training.daos;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


import com.training.domains.Item;
import com.training.ifaces.DAO;

public class ItemDAO extends JdbcDaoSupport implements DAO<Item> {

	@Override
	public boolean Add(Item t) {
		boolean result = false;
		String sql = "Insert into item values (?,?,?)";
		
		int rowInserted = getJdbcTemplate().update(sql,t.getItemId(),t.getItemName(),t.getItemType());
		
		if(rowInserted >0){
			
			result = true;
		}
		
		
		return result;
	}

	@Override
	public Item find(int key) {
		
			
			String sql = "Select * from item where itemid = ?";
			
			Item item = getJdbcTemplate().queryForObject(sql,new BeanPropertyRowMapper<Item>(Item.class),key);
			
			return item;
		
	}

	@Override
	public List<Item> findAll() {

		String sql = "Select * from item ";
		
		List<Item> itemList = getJdbcTemplate().query(sql,new BeanPropertyRowMapper<Item>(Item.class));
		
		return itemList;
	}



}
