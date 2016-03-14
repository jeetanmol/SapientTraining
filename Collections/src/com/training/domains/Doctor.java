package com.training.domains;

import java.util.TreeSet;

public class Doctor implements Comparable<Doctor> {
	
	private long doctorId;
	private String doctorName;
	private String specialization;
	
	private TreeSet<Patient> patients;
	
	
	
	
	

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Doctor(long doctorId, String doctorName, String specialization) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
	}

	public TreeSet<Patient> getPatients() {
		return patients;
	}


	public void setPatients(TreeSet<Patient> patients) {
		this.patients = patients;
	}

	public long getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return doctorId + " : " + doctorName + " : " + specialization ;
	}


	@Override
	public int compareTo(Doctor o) {
		
		if(	doctorId < o.doctorId) return -1;
		if(doctorId > o.doctorId)	return 1;
		return 0;
	}


	
	
	

}
