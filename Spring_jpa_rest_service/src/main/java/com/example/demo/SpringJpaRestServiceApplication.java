package com.example.demo;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.PassengerRepo;
import com.example.demo.entity.TripHistory;


@SpringBootApplication
public class SpringJpaRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaRestServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			PassengerRepo repo;
			
			@Override
			public void run(String... args) throws Exception {
				
				TripHistory trip1 = new TripHistory(201, LocalDateTime.of(2015, Month.AUGUST,11,16,00), "Chennai", "Cuddalore", 2000);
				List<TripHistory> tripList = new ArrayList<TripHistory>();
				tripList.add(trip1);
				
				 repo.save(new Passenger(101, "Ram", "gowe@gmail.com", "chennai",tripList));
			}
		};
	}
}



