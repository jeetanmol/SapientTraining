package com.training.maps;

import java.util.*;

public class ManagerEmployee {

	
	HashMap<String, List<String>> managerList;
	
	public ManagerEmployee(){
		
		managerList = new HashMap<String,List<String>>();
		init();
	}
	
	public void init(){
		
		ArrayList<String> list1= new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>() ;
		list1.add("Ramesh");
		list1.add("Rajesh");
		list1.add("Rakesh");
		list2.add("Ritu");
		list2.add("Rani");
		
		managerList.put("Anmol", list1);
		managerList.put("Rupesh", list2);
			
		
	}
	
	public List<String> getEmployee(String manager){
		
		return managerList.get(manager);
		
	}
	
	public void printEmployees(){
		
		managerList.forEach((k,v) -> System.out.println(k + " := " + v));
	}
}
