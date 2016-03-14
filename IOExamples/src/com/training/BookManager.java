package com.training;

import java.io.*;


public class BookManager {
	
	
	public String addBooks(Book[] bks){
		PrintWriter out = null;
		
		try {
			 out = new PrintWriter(new FileWriter(new File("Book.ser")));
			
			for(Book obj : bks){
				out.println(obj);
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			out.close();
		}
		String message = "One book detail added";
		return message;
	}
	
	
	public void printBooks(File file){
		
		String line = null;
		try{
			BufferedReader oin = new BufferedReader(new FileReader(new File("Book.ser")));
			
			while( (line = oin.readLine()) != null){
				System.out.println(line);
				
				
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
