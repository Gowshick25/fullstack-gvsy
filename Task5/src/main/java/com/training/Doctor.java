package com.training;
import java.util.HashMap;
import java.util.Set;

import com.training.model.Patient;

public class Doctor {
	
	private int doctorId;
	private String doctorName;
	private String department;
    private Set<Patient> patients;
    private HashMap<Integer, Patient> doctor;
    
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Set<Patient> getPatients() {
		
		
		return patients;
	}
	public void setPatients(Set<Patient> patients) {
		this.patients = patients;
	}
	public Doctor(int doctorId, String doctorName, String department, Set<Patient> patients) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.department = department;
		this.patients = patients;
	}
	
	public Doctor(int doctorId, String doctorName, String department) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.department = department;
	}
	
	
	
	public Doctor(int doctorId, String doctorName, String department,
			HashMap<Integer, Patient> doctor) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.department = department;
		this.doctor = doctor;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", department=" + department
				+ ", patients=" + patients + "]";
	}
	
    
    
}
