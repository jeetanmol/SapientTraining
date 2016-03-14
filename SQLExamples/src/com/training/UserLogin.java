package com.training;

import java.sql.*;

import com.training.util.User;
import com.training.utils.SqlConnection;

public class UserLogin 
{
	
	private Connection con;

	public UserLogin() {
		super();
		
		con = SqlConnection.getOracleConnection();
		
	}



	public boolean validateUser(User t){
		boolean found = false;
		String sql = "select * from userlogin where userid = ? and password = ? ";
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, t.getUserId());
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