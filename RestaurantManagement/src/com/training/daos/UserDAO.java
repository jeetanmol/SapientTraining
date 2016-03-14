package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.training.domains.User;
import com.training.ifaces.DAO;
import com.training.utils.SqlConnection;

public class UserDAO implements DAO<User> {
	
	private Connection con;
	
	public UserDAO() {
		super();
		con = SqlConnection.getOracleConnection();
	}


	@Override
	public int add(User t) {
		
		String sql = "insert into user_login values(?,?)";
		int rowadded = 0;
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, t.getUser_id());
			pst.setString(2, t.getPassword());
			
			rowadded = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return rowadded;
	}

	
	@Override
	public User find(int id) {
		
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(int id, String... vars) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
}
