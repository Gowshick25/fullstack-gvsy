package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;


@SpringBootApplication
public class SpringDataJpaSimpletestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaSimpletestApplication.class, args);
		
		//Employee ram= ctx.getBean(Employee.class);
		
		EmployeeService service = ctx.getBean(EmployeeService.class);
		
		//System.out.println(service.add(ram));
		
		//service.findAll().forEach(System.out::println);
		
		//System.out.println(service.findByEmployeeLoc("chennai"));
		
		//System.out.println(service.findByEmployeeSkill("FullStack "));
		
		//System.out.println(service.findByskillSetAndLoc("FullStack", "ooty"));
		
		//System.out.println(service.findBydateofbirth(LocalDate.of(1956,07,13)));
	
	}

	@Bean
	public Employee ram()
	{
		return new Employee(103, "Gowshick", LocalDate.of(1956,07, 13), "ooty", "FullStack ", 847568643L);
	}
}
