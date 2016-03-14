package com.training.daos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.training.domains.Employee;
import com.training.ifaces.DAO;
import com.training.utils.SqlConnection;

public class EmployeeDAO implements DAO<Employee> {
	
	private Connection con;
	

	public EmployeeDAO() {
		super();
		con = SqlConnection.getOracleConnection();
	}

	//Inserting Employee Records
	@Override
	public int add(Employee emp) {
		
		String sql = "insert into employee values(?,?,?,?,?)";
		int rowadded = 0;
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, emp.getEmployee_Id());
			pst.setString(2, emp.getEmployee_Name());
			pst.setLong(3, emp.getPhoneNumber());
			pst.setString(4, emp.getRole());
			pst.setDouble(5, emp.getSalary());
			
			rowadded = pst.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowadded;
	}

	
	
	@Override
	public Employee find(int id) {
		
		String sql = "Select * from employee where employee_id = ?";
		Employee emp = null;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet resultSet = pst.executeQuery();
			if(resultSet.next()){
			emp = new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getLong(3), resultSet.getString(4),resultSet.getDouble(5));
			
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return emp;
	}

	@Override
	public List<Employee> findAll() {

		String sql = "Select * from employee ";
		List<Employee> employeeList = new ArrayList<Employee>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet resultSet = pst.executeQuery();
			while(resultSet.next()){
			Employee emp;
			emp = new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getLong(3), resultSet.getString(4),resultSet.getDouble(5));
			employeeList.add(emp);
			
			
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return employeeList;
		
	}

	@Override
	public int update(int id, String... vars) {
		
		String sql = "update employee set salary =? where employee_id = ?";
		int rowupdated = 0;
		
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(2, id);
			pst.setDouble(1, Double.parseDouble(vars[0]));
			
			rowupdated = pst.executeUpdate();
			return rowupdated;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return rowupdated;
	}

	@Override
	public int delete(int id) {
		String sql = "delete employee where employee_id = ?";
		int rowdeleted = 0;
		
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			
			pst.setInt(1, id);
			
			rowdeleted = pst.executeUpdate();
			return rowdeleted;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return rowdeleted;

	}

}
