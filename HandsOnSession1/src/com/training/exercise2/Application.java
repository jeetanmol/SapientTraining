package com.training.exercise2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		

		
		Media media = new Media();
		
		 String title;
		 String author;
		 String subject;
		 int volume;
		 double rating;
		 int ISBN;
		 int lendingTime;
		 double runningTime;
		
		Scanner scn = new Scanner(System.in);
		do{
		System.out.println("Press 1 for Adding \n 2 for Viewing \n 3 for Exit:" );
		int key = scn.nextInt();
		switch (key) {
		case 1:
			System.out.println("Insert the details of MediaType:");
			System.out.println("Which Mediatype you want to insert: 1.Books 2.Periodical 3.DVD");
			int key1 = scn.nextInt();
			System.out.println("Enter the title: ");
			title = scn.next();
			System.out.println("Enter the Author: ");
			author = scn.next();
			System.out.println("Enter the Subject: ");
			subject = scn.next();
			System.out.println("Enter the Volume: ");
			volume = scn.nextInt();
			System.out.println("Enter the Rating: ");
			rating = scn.nextDouble();
			
			switch (key1) {
			case 1:
				
				System.out.println("Enter the ISBN no of the book: ");
				ISBN = scn.nextInt();
				Books b = new Books(title, author, subject, volume, rating, ISBN);
				media.addMedia(b);
				break;
			case 2:
				
				System.out.println("Enter the lending time of the periodical: ");
				lendingTime = scn.nextInt();
				Periodical p = new Periodical(title, author, subject, volume, rating, lendingTime);
				media.addMedia(p);
				break;
			case 3:
				
				System.out.println("Enter the running time of the DVD: ");
				runningTime = scn.nextInt();
				Dvd d = new Dvd(title, author, subject, volume, rating, runningTime);
				media.addMedia(d);
				break;
			default:
				break;
			}
			break;
		case 2:
			System.out.println("Which Mediatype you want to view: 1.Books 2.Periodical 3.DVD");
			int key2 = scn.nextInt();
			media.getMedia(key2);
			break;
		case 3:
			
			System.exit(0);

		default:
			System.out.println("Wrong choice!! Please Enter again");
		}
		System.out.println("Insert the details of MediaType:");
		System.out.println("Which Mediatype you want to insert: 1.Books 2.Periodical 3.DVD");
		}while(true);
		
		
	}

}
