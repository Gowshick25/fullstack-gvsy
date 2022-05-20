package com.example.demo.utils.bidirection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.ifaces.bidirection.DoctorRepository;
import com.example.demo.ifaces.bidirection.PatientRepository;

public class Utility {
	
	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	@Autowired
	PatientRepository patientRepo;
	
	public void  create() {
		
		doc.setPatientList(patientList);
		
		Doctor added = repo.save(doc);
		
		if(added!=null) {
			System.out.println("One Record Added");
		}
		
	}
	
	public void findAll() {
		
		List<Doctor> doc = repo.findAll();
		
		for(Doctor eachDoctor:doc) {
			System.out.println(("Doctor Name:- "+eachDoctor.getDoctorName()));
			System.out.println(("Departement:- "+eachDoctor.getDepartment()));
			
			List<Patient> patients = eachDoctor.getPatientList();
			for(Patient eachPatient: patients) {
				
				System.out.println("Patient Name:- "+eachPatient.getPatientName());
				System.out.println("Mobile number:- "+eachPatient.getMobileNumber());
			}
		}
		
	}
	
	
	public void findDoctorFrmPatient()
	{
		Patient entity = patientRepo.findById(201).get();
		System.out.println(entity.getPatientName());
		System.out.println(entity.getDoctor());
	}
}
