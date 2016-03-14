package com.training.daos;

import java.util.List;


import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.training.domains.Service;
import com.training.ifaces.DAO;
import com.training.utils.ServiceRowMapper;

public class ServiceDAO extends JdbcDaoSupport implements DAO<Service> {

	@Override
	public boolean Add(Service t) {
		boolean result = false;
		String sql = "Insert into service values (?,?,?,?)";
		
		int rowInserted = getJdbcTemplate().update(sql,t.getServiceId(),t.getProbDesc(),t.getCustomer().getCustomerId(),t.getItem().getItemId());

		if(rowInserted >0){
			
			result = true;
		}
	
		return result;
	}

	@Override
	public Service find(int key) {
		String sql = "Select * from service where serviceid = ?";
		
		Service serv = getJdbcTemplate().queryForObject(sql,new ServiceRowMapper(),key);
		
		return serv;
	}

	@Override
	public List<Service> findAll() {
		String sql = "Select * from service ";
		
		List<Service> servList = getJdbcTemplate().query(sql,new ServiceRowMapper());
		
		return servList;
	}

}
