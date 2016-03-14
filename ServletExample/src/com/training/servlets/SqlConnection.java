package com.training.servlets;


import java.sql.*;


public class SqlConnection {
	
	static Connection con = null;

	public static Connection getOracleConnection(){
		if(con ==null){
		
		
		try{
			
			
			
			//FileInputStream in = new FileInputStream(new File("dbConnection.properties"));
			
			//prop.load(in);
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ",
					"system",
					"system");
			
			
		}catch(Exception o){
			
			o.printStackTrace();
		}}
		return con;
	}
}
