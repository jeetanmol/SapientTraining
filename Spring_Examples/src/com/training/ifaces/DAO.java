package com.training.ifaces;

import java.util.List;

public interface DAO<T> {
	
	public boolean Add(T t);
	public T find(int key);
	public List<T> findAll();
	

}
