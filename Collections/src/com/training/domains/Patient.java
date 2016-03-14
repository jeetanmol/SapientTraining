package com.training.domains;

public class Patient implements Comparable<Patient> {

	
	private int patientId;
	private String patientName;
	private int patientphone;
	public Patient(int patientId, String patientName, int patientphone) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientphone = patientphone;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientphone() {
		return patientphone;
	}
	public void setPatientphone(int patientphone) {
		this.patientphone = patientphone;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return patientId + " : " + patientName + " : " + patientphone ;
	}
	@Override
	public int compareTo(Patient o) {
		// TODO Auto-generated method stub
		if(patientId<o.patientId) return -1;
		if(patientId > o.patientId) return 1;
		return 0;
	}
	
	
}
