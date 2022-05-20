package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;
import com.example.demo.utils.bidirection.Utility;


@SpringBootApplication
public class SpringDataJpaOneToManyApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaOneToManyApplication.class, args);
	
	DoctorUtils obj = ctx.getBean(DoctorUtils.class);
	Utility obj1 = ctx.getBean(Utility.class);
	
	obj.create();
	obj.findAll();
	obj1.findDoctorFrmPatient();
	ctx.close();
	}
	
	@Bean
	public Doctor munna() {
		Doctor doc = new Doctor();
		doc.setDoctorId(201);
		doc.setDoctorName("Munna");
		doc.setDepartment("heart");
		doc.setPhoneNumber(4839763);
		
		return doc;
	}
	@Bean
	public Patient pavi()
	{
		return new Patient(201,"Pavithra",683856, null);
	}
	
	@Bean
	public Patient kavi()
	{
		return new Patient(202,"Kavitha",5758578, null);
	}
	
	@Bean
	public Patient magi()
	{
		return new Patient(203,"Malathy",9678568l, null);
	}

}