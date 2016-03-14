package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.training.domains.Dish;
import com.training.ifaces.DAO;
import com.training.utils.SqlConnection;

public class DishDOA implements DAO<Dish>{
	
	private Connection con;

	public DishDOA() {
		super();
		con = SqlConnection.getOracleConnection();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(Dish t) {
		
		String sql = "insert into dish values(?,?,?,?,?,?)";
		int rowadded = 0;
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, t.getDishId());
			pst.setString(2, t.getDishName());
			pst.setDouble(3, t.getPrice());
			pst.setString(4, t.getCategory());
			pst.setString(5, t.getAvailabilty());
			pst.setInt(6, t.getPrepTime());
			
			rowadded = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowadded;
		
	}

	@Override
	public Dish find(int id) {
		
		String sql = "select * from dish where dish_id = ?";
		Dish dish = null;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet resultSet = pst.executeQuery();
			
			if(resultSet.next()){
				dish = new Dish();
				dish.setDishId(id);
				dish.setDishName(resultSet.getString(2));
				dish.setPrice(resultSet.getDouble(3));
				dish.setCategory(resultSet.getString(4));
				dish.setAvailabilty(resultSet.getString(5));
				dish.setPrepTime(resultSet.getInt(6));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dish;
	}

	@Override
	public List<Dish> findAll() {
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
