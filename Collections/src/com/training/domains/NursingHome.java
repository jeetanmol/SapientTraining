package com.training.domains;

import java.util.*;

import com.training.utils.MyComparators;

public class NursingHome {
	
	//Creating Type Safe Ordered Collection
	private ArrayList<Doctor> doclist;
	
	public NursingHome(){
		
		doclist = new ArrayList<Doctor>();
		
		
	}
	
	public boolean addDoctor(Doctor doc){
		
		
		boolean result = doclist.add(doc);
		
		return result;
		
		
	}
	
	public void printDoctorList(){
		
		for(Doctor doc: doclist){
			
			System.out.println(doc);
			if(doc.getPatients() != null){
			System.out.println("Appt Details");
			
			for(Patient pat: doc.getPatients()){
				System.out.println(pat);
			}
		}
			else
				System.out.println("No Appointments");
		}
	}
	
	public void printSortedList(){
		
		Collections.sort(doclist);
		printDoctorList();
		
	}
	
	public void printSortedList(int key){
		MyComparators comp = new MyComparators();
		switch (key) {
		case 1:
			
			printSortedList();
			break;
		
		case 2:
			
			MyComparators.NameComparator comp1 = comp.new NameComparator();
			Collections.sort(doclist, comp1);
			printDoctorList();
			break;
		
		case 3: 
			
			MyComparators.SpecilizationComparator comp2 = comp.new SpecilizationComparator();
			Collections.sort(doclist, comp2);
			printDoctorList();
			break;
			
		default:
			break;
		}
	}
}
