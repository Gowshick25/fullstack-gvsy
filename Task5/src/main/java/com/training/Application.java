package com.training;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

import com.training.model.Patient;

public class Application {

	public static void main(String[] args) {
		
	
		Patient pat=new Patient(101, "vish", "Nellore", 756584584);
		Patient pat1=new Patient(102, "yovel", "Chennai", 756558584);
		Patient pat2=new Patient(103, "Sathiya", "Chennai", 778458584);
		
		Set<Patient> kannaPatList=new HashSet<>();
		
		kannaPatList.add(pat);
		kannaPatList.add(pat1);
		kannaPatList.add(pat2);
		
		Doctor doc=new Doctor(1001, "Gowshick", "Neurologist", kannaPatList);
		
		System.out.println("Doctor : " +doc.getDoctorName());
		for( Patient eachPat:doc.getPatients()) {
			System.out.println(eachPat);
			
		}
		
		Map<Doctor,Set<Patient>> app=new HashMap<>();
		Map<Doctor,Set<Patient>> map1=new HashMap<>();
		map1.put(doc,kannaPatList);
		//map1.put(doc1,rampatients);
		Appointment app1=new Appointment(map1);
		
		System.out.println(app1.getPatients(doc));
		
		
		
		
		
		

	}

}
