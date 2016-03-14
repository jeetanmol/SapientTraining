package com.training.utils;

import java.util.Comparator;

import com.training.domains.Doctor;


public class MyComparators{
	
	//nested or inner class 
	public class NameComparator implements Comparator<Doctor>{

	
		@Override
		public int compare(Doctor o1, Doctor o2) {
			
			
			return o1.getDoctorName().compareTo(o2.getDoctorName());
			
		}
		
	}

	public class SpecilizationComparator implements Comparator<Doctor>{

		@Override
		public int compare(Doctor o1, Doctor o2) {
			
			// String class already implements comparable
			
			return o1.getSpecialization().compareTo(o2.getSpecialization());
		}
		
	}

}
