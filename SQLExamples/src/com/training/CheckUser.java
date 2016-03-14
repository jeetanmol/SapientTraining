package com.training;

import com.training.util.User;

public class CheckUser {

	public static void main(String[] args) {
		
		
		 User user1 = new User(102,"abcde","admin");
		 UserLogin login = new UserLogin();
		 boolean n;
		 n = login.validateUser(user1);
		 if(n)
		 {
			 System.out.println("Entered credentials are correct");
			 
		 }
		 else
		 {
			 System.out.println("Entered ceredentials are incorrect");
		 }
		 

	}

}
