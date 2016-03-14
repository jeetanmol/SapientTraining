package com.training.daos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.training.apps.DAO;
import com.training.utils.SqlConnection;

public class CustomerDAO implements DAO<Customer2016> {

	
	private Connection con;
	
	
	public CustomerDAO() {
		super();
		con = SqlConnection.getOracleConnection();
	}

	
	@Override
	public int add(Customer2016 t) {
		
		String sql = "insert into customer values(?,?,?,?)";
		int rowAdded = 0;
		
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, t.getCustomerId());
			pst.setString(2, t.getCustomerName());
			pst.setLong(3, t.getHandPhone());
			pst.setString(4, t.getEmail_Id());
			
			rowAdded = pst.executeUpdate();
			return rowAdded;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return 0;
	}

	

	@Override
	public Customer2016 find(int key) {
		

		String sql = "select * from customer where customerid = ?";
		
		Customer2016 cust = null;
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setInt(1, key);
			ResultSet resultSet = pst.executeQuery();
			
			while(resultSet.next()){
				
			
				String customerName = resultSet.getString(2);
				long phone = resultSet.getLong(3);
				String email = resultSet.getString(4);
				
				cust = new Customer2016(key, customerName, email, phone);
				
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cust;
	}

	@Override
	public List<Customer2016> findAll() {
		
		String sql = "select * from customer";
		List<Customer2016> customers = new ArrayList<Customer2016>();
		
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rst = pst.executeQuery();
			
			while(rst.next()){
				
				int customerId = rst.getInt(1);
				String customerName = rst.getString(2);
				long phone = rst.getLong(3);
				String email = rst.getString(4);
				
				Customer2016 cust = new Customer2016(customerId, customerName, email, phone);
				customers.add(cust);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customers;
	}

	@Override
	public int update(int key) {
		
		String sql = "update customer set customername = ? where customerid = ?";
		int i = 0;
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, "rupesh");
			pst.setInt(2, key);
			
			i = pst.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return i;
	}

	@Override
	public int delete(int key) {
		
		String sql = "delete from customer where customerid = ?";
		int i= 0;
		
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, key);
			
			i= pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return i;
	}

}
