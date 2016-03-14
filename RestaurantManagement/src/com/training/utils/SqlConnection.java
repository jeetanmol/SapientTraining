package com.training.utils;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class SqlConnection {
	
	static Connection con = null;

	public static Connection getOracleConnection(){
		if(con ==null){
		Properties prop = new Properties();
		
		try{
			
			
			
			FileInputStream in = new FileInputStream(new File("dbConnection.properties"));
			
			prop.load(in);
			
			Class.forName(prop.getProperty("db.className"));
			
			con = DriverManager.getConnection(prop.getProperty("db.url"),
					prop.getProperty("db.userName"),
					prop.getProperty("db.passWord"));
			
			
		}catch(Exception o){
			
			o.printStackTrace();
		}}
		return con;
	}
}
