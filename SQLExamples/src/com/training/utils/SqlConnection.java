package com.training.utils;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class SqlConnection {

	public static Connection getOracleConnection(){
		
		Connection con = null;
		
		
		
		try{
			
			Properties prop = new Properties();
			
			//FileInputStream in = new FileInputStream(new File("dbConnection.properties"));
			
			//prop.load(in);
			InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("dbConnection.properties");
			prop.load(stream);
			Class.forName(prop.getProperty("db.className"));
			
			con = DriverManager.getConnection(prop.getProperty("db.url"),
					prop.getProperty("db.userName"),
					prop.getProperty("db.passWord"));
			
			
		}catch(Exception o){
			
			o.printStackTrace();
		}
		return con;
	}
}
