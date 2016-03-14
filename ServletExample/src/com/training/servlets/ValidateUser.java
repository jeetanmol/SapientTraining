package com.training.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ValidateUser {
	
	
	private Connection con ;

	public ValidateUser() {
		super();
		con = SqlConnection.getOracleConnection();
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean validate(User t){
		
		boolean found = false;
		String sql = "select * from user_login where employee_id = ? and password = ? ";
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, t.getUser_id());
			pst.setString(2, t.getPassword());
			ResultSet result = 	pst.executeQuery();
			found = result.next();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return found;
	}
	

}
