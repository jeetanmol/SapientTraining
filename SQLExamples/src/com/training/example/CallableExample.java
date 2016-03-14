package com.training.example;

import java.sql.*;

public class CallableExample {
	
	public static void main(String[] args) {
		
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:system/system@localhost:1521/XE";
			
			Connection con = DriverManager.getConnection(url);
			
			CallableStatement st = con.prepareCall("call updatePhoneNumber(?,?)");
			
			st.setInt(1, 102);
			st.setInt(2, 564665);
			
			st.execute();
			
			System.out.println("Thanks for updating Phone Number");
			
			
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
