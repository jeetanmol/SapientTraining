package com.training.apps;

import com.training.util.User;

public interface Login {
	
	public int validate();
	public int add(User user);
	public int delete();
	public User find();
	

}
