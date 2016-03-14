package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.training.domains.Order;
import com.training.domains.Table;
import com.training.ifaces.DAO;
import com.training.utils.SqlConnection;

public class OrderDAO implements DAO<Order>{
	
	private Connection con;

	public OrderDAO() {
		super();
		con = SqlConnection.getOracleConnection();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(Order t) {
		
		String sql = "insert into orders values(?,?,?)";
		int rowadded = 0;
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, t.getOrderId());
			pst.setInt(2, t.getTable().getTableNo());
			pst.setInt(3,t.getNumberOfDiners());
			
			
			rowadded = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowadded;
	}

	@Override
	public Order find(int id) {
		String sql = "select * from orders where order_id = ?";
		Order order = null;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()){
				TableDAO tableDAO = new TableDAO();
				Table table = tableDAO.find(rs.getInt("table_no"));
				order = new Order();
				order.setOrderId(id);
				order.setNumberOfDiners(rs.getInt("numberofdiners"));
				order.setTable(table);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return order;
	}

	@Override
	public List<Order> findAll() {
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
