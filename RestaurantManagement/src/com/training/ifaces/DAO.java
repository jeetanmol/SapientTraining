package com.training.ifaces;

import java.util.List;

public interface DAO<T> {

	public int add(T t);
	public T find(int id);
	public List<T> findAll();
	public int update(int id,String... vars );
	public int delete(int id);
	
	
	
	

}
