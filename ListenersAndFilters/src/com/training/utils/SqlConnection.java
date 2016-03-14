package com.training.utils;


import java.sql.Connection;
import java.sql.DriverManager;


public class SqlConnection {
	static Connection con = null;

	public static Connection getOracleConnection(String userName, String password, String url, String className){
		if(con ==null){
		try{
			
			Class.forName(className);
			
			con = DriverManager.getConnection(url,
					userName,
					password);
			
			
		}catch(Exception o){
			
			o.printStackTrace();
		}}
		return con;
	}

}
