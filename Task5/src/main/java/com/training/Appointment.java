package com.training;

import java.util.*;
import java.util.Set;

import com.training.Doctor;
import com.training.model.*;

public class Appointment {
	 
	private Map<Doctor, Set<Patient>>List;

	public Map<Doctor, Set<Patient>> getList() {
		return List;
	}

	public void setList(Map<Doctor, Set<Patient>> list) {
		List = list;
	}

	public Appointment() {
		super();
		List=new HashMap<>();
		// TODO Auto-generated constructor stub
	}

	public Appointment(Map<Doctor, Set<Patient>> list) {
		super();
		List = list;
	}

	@Override
	public String toString() {
		return "Appointment [List=" + List + "]";
	}
	
	public Set<Patient> getPatients(Doctor key)
	{
		return this.List.get(key);
	}
}
	
	

























































//package com.training;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//import com.training.model.Patient;
//
//public class Appointment {
//	public static void main(String[] args)
//	{
//	
//	
//	Patient pat=new Patient(101, "vish", "Nellore", 756584584);
//	Patient pat1=new Patient(102, "yovel", "Chennai", 756558584);
//	Patient pat2=new Patient(103, "Sathiya", "Chennai", 778458584);
//	
//	
//	
//	HashMap<Integer, Patient> map=new HashMap<>();
//	
//    map.put(201,pat);
//    map.put(202,pat1);
//    map.put(203,pat2);
//    
//    HashMap<Integer, Doctor> map1=new HashMap<>();
//    
//    Doctor doc=new Doctor(1001, "Gowshick", "Neurologist", map);
//    Doctor doc1=new Doctor(1002, "Ram", "PHYSICIANS", map);
//    map1.put(201, doc);
//    map1.put(202, doc1);
//    
//  
//    //System.out.println(doc);
//    //System.out.println(map.get(201));
//    Set<Map.Entry<Integer, Patient>> obj= map.entrySet();
//    
//    for (Map.Entry<Integer, Patient> eachEntry : obj )
//    {
//    	System.out.println(eachEntry.getKey());
//    	System.out.println(eachEntry.getValue());
//    }
//	}
//    
//}
//
