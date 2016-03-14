package com.training.apps;

import java.util.ArrayList;
import java.util.List;

import com.training.daos.Customer2016;
import com.training.daos.CustomerDAO;


public class Application {

	public static void main(String[] args) {
		
		List<Customer2016> customerslist = new ArrayList<Customer2016>();
		//adding rows
		/*Customer2016 cust1 = new Customer2016(104,"Anmol","sdgu",3628234);
		Customer2016 cust2 = new Customer2016(105,"Anmocdgudl","sdddsgu",36286534);
		
		CustomerDAO customerDAO = new CustomerDAO();
		System.out.println(customerDAO.add(cust1));
		System.out.println(customerDAO.add(cust1) + "\n");*/
		
		//finding a single row
		CustomerDAO cus = new CustomerDAO();
		/*Customer2016 cust1 = new Customer2016();
		cust1 = cus.find(101);
		System.out.println(cust1.showCustomer2016());*/
		
		//updating a row
		
		//System.out.println(cus.update(102) + " row upated");
		
		//deleting a row
		//System.out.println(cus.delete(104) + "row deleted");
		customerslist = cus.findAll();
		for(Customer2016 customer : customerslist)
		{
			System.out.println(customer.showCustomer2016());
		}
		

	}

}
