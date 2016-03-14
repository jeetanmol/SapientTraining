package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.domains.Dish;
import com.training.domains.Order;
import com.training.domains.OrderDetails;
import com.training.ifaces.DAO;
import com.training.utils.SqlConnection;

public class OrderDetailsDAO implements DAO<OrderDetails> {
	
	private Connection con;

	public OrderDetailsDAO() {
		super();
		// TODO Auto-generated constructor stub
		con = SqlConnection.getOracleConnection();
	}

	@Override
	public int add(OrderDetails t) {
		String sql = "insert into order_details values(?,?,?,?,?)";
		int rowadded = 0;
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, t.getOrder().getOrderId());
			pst.setInt(2, t.getDish().getDishId());
			pst.setInt(3, t.getQuantity());
			pst.setTimestamp(4, t.getOrderTime());
			pst.setString(5, t.getStatus());
			
			rowadded = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowadded;

		
	}

	@Override
	public OrderDetails find(int id) {
		
	
		return null;
	}
	
	public List<OrderDetails> findAll(int id){
		String sql = "select * from order_details where order_id = ?";
		ArrayList<OrderDetails> orderDetails = new ArrayList<OrderDetails>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()){
			
				DishDOA dishDOA = new DishDOA();
				OrderDAO orderDAO = new OrderDAO();
				OrderDetails orderDetails2 = new OrderDetails();
				
				Order order = orderDAO.find(rs.getInt(1));
				Dish dish = dishDOA.find(rs.getInt(2));
				
				orderDetails2.setOrder(order);
				orderDetails2.setDish(dish);
				orderDetails2.setQuantity(rs.getInt(3));
				orderDetails2.setOrderTime(rs.getTimestamp("ordertime"));
				orderDetails2.setStatus(rs.getString(5));
				
				
				orderDetails.add(orderDetails2);
				
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return orderDetails;
		
		
	}

	@Override
	public List<OrderDetails> findAll() {
		String sql = "select * from orders";
		ArrayList<OrderDetails> orderDetails = new ArrayList<OrderDetails>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
		
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()){
			
				DishDOA dishDOA = new DishDOA();
				OrderDAO orderDAO = new OrderDAO();
				OrderDetails orderDetails2 = new OrderDetails();
				
				Order order = orderDAO.find(rs.getInt(1));
				Dish dish = dishDOA.find(rs.getInt(2));
				
				orderDetails2.setOrder(order);
				orderDetails2.setDish(dish);
				orderDetails2.setQuantity(rs.getInt(3));
				orderDetails2.setOrderTime(rs.getTimestamp(4));
				orderDetails2.setStatus(rs.getString(5));
				
				
				orderDetails.add(orderDetails2);
				
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return orderDetails;
		
		
	
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
