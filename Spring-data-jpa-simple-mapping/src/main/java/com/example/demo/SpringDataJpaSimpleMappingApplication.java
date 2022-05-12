package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.demo.services.DoctorService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaSimpleMappingApplication.class, args);
		
//		Doctor siva = ctx.getBean(Doctor.class);
//		Doctor added = service.add(siva);
		
//		if(added!=null) {
//			System.out.println("One Doctor added");
//		}
		
		DoctorService service = ctx.getBean(DoctorService.class);
		
		
		
		System.out.println(service.findByDept("dental"));
		
		System.out.println(service.findByDoc("Siva"));
		
		//System.out.println(service.findByDocNameAndDept("Siva", "ent"));
		
		System.out.println(service.getByNameDept("Siva", "ent"));
		
		ctx.close();
	}
	
	
//	
//	@Bean
//	public Doctor siva() {
//		return new Doctor(2020,"Siva","ent",8959446);
//	}

//	@Bean
//	public Doctor vishu() {
//		return new Doctor(1010,"vishu","dental",8929036);
//	}

}