package com.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExample {
	
	public static void main(String[] args) {
		
		File f = new File("Sample.txt");
		
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			PrintWriter writer = new PrintWriter(f);
			writer.println("Hello");
			writer.close(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File dir = new File(".");
		File[] fileList = dir.listFiles();
		
		for(File file : fileList){
			
			if(file.isDirectory()){
				System.out.println("\t\t\t\t" + file);
			}
			else
				System.out.println(file);
		}
		
		System.out.println(f.exists());
	
	}

}
