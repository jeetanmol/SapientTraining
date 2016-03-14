package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.training.domains.Employee;
import com.training.domains.Table;
import com.training.ifaces.DAO;
import com.training.utils.SqlConnection;

public class TableDAO implements DAO<Table>{
	
	private Connection con;

	public TableDAO() {
		super();
		con = SqlConnection.getOracleConnection();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(Table t) {
		
		String sql = "insert into waiter_table values(?,?)";
		int rowadded = 0;
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, t.getTableNo());
			pst.setInt(2, t.getEmployee().getEmployee_Id());
			
			rowadded = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowadded;
	}

	@Override
	public Table find(int id) {
		
		String sql = "select * from waiter_table where table_no =?";
		Table table = null;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet resultSet = pst.executeQuery();
			if(resultSet.next()){
				table = new Table();
				EmployeeDAO employeeDAO = new EmployeeDAO();
				Employee emp = employeeDAO.find(resultSet.getInt(2));
				table.setEmployee(emp);
				table.setTableNo(id);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return table;
	}

	@Override
	public List<Table> findAll() {
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
