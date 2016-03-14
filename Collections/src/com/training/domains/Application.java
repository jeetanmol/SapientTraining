package com.training.domains;


import java.util.TreeSet;

public class Application {

	
	public static void main(String[] args) {
		
		NursingHome nursingHome = new NursingHome();
		
		Patient p1 = new Patient(2, "Anmol", 579797450);
		Patient p2 = new Patient(3, "Rupesh", 23468446);
		Patient p3 = new Patient(4, "Nik", 62343849);
		
		Doctor d1 = new Doctor(101, "Ramesh", "rrain");
		Doctor d2 = new Doctor(104, "Suresh", "skin");
		Doctor d3 = new Doctor(103, "Resh", "klental");
		
		
		nursingHome.addDoctor(d1);
		nursingHome.addDoctor(d2);
		nursingHome.addDoctor(d3);
		
		TreeSet< Patient> patientSet = new TreeSet<Patient>();
		
		//HashSet<Patient> patientSet = new HashSet<Patient>();
		patientSet.add(p1);
		patientSet.add(p2);
		patientSet.add(p3);
		patientSet.add(p3);
		
		d1.setPatients(patientSet);
		
		
		
		nursingHome.printDoctorList();
		System.out.println("\n");
		/*nursingHome.printSortedList(1);
		System.out.println("\n");
		nursingHome.printSortedList(2);
		System.out.println("\n");
		nursingHome.printSortedList(3);*/
		
	}
}
