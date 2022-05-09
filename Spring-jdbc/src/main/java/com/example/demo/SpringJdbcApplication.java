package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringJdbcApplication.class, args);
		
		ProductRepository repo = ctx.getBean(ProductRepository.class);
		
		Product tv = ctx.getBean(Product.class);
		
		System.out.println("Row added : "+ repo.add(tv));
		
		Optional<Product>opt=repo.findbyId(2000);
		
		if(opt.isPresent()) 
		{
			
			System.out.println(opt.get());
		}
		else 
		{
			System.out.println("......no words");
		}
		
		System.out.println("UPDATE : "+repo.update(tv));
		
		System.out.println("DELETE : "+repo.remove(14));
		
		repo.findAll().forEach(System.out::println);
	
	}
	
	@Bean
	@Primary
	public Product  tv()
	{
		return new Product(20,"LG heater",400);
	
	}
}
