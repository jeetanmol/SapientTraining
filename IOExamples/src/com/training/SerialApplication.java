package com.training;

public class SerialApplication {

	public static void main(String[] args){
		
		Book b = new Book(101,"Da Vinci Code","Dan Brown",500);
		
		
		BookSerializer bookSerializer = new BookSerializer();
		
		System.out.println(bookSerializer.serialize(b));
		
		Book b1 = (Book) bookSerializer.deSerialize();
		
		System.out.println(b1.toString());
	
		
	}
}
