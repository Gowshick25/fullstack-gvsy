package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;

@SpringBootApplication
public class SpringDataJpaOneToOneApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaOneToOneApplication.class, args);
	
		 System.out.println(ctx.getBean(Speaker.class));
	
	
	}
	
	
	@Bean
	public Seminar clg() {
		Seminar sem = new Seminar();
		sem.setId(101);
		sem.setName("java");
		sem.setDuration(45);
		
		return sem;
	}
	@Bean
	public Speaker pavi()
	{
		return new Speaker(2001, "mano","BE");
	}

//	@Bean
//	public Patient kavi()
//	{
//		return new Patient(202,"Kavitha",5758578);
//	}
//
//	@Bean
//	public Patient magi()
//	{
//		return new Patient(203,"Malathy",9678568);
//	}
}
