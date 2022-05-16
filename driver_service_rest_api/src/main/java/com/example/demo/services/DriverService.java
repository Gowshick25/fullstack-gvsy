package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Driver;
import com.example.demo.repo.DriverRepository;


@Service
public class DriverService {
	
	
	private DriverRepository repo;
	
	@Autowired
	public DriverService(DriverRepository repo) {
		super();
		this.repo = repo;
	}

	public List<Driver> findAll() {
		return this.repo.findAll();
	}

	public Driver add(Driver entity) {
		return this.repo.save(entity);
	}

	public Driver findById(int id)
	{
		return this.repo.findById(id).orElseThrow(()->new RuntimeException(id+"not found"));
	}

//	public void DeleteById(int id) {
//		this.repo.deleteById(id);
//	
//		
//	}


	public Optional<Driver> removeDriver(Driver entity) {
		
		   Optional<Driver> optional = Optional.empty();

		   if(this.repo.existsById(entity.getDriverId())) {

		   this.repo.delete(entity);

		   optional = Optional.of(entity);
		   }

		         return optional;  
	}
	
//	public void DeleteById(int id) 
//	{
//		try {
//			this.repo.deleteById(id);
//		} catch (Exception e) {
//			e.printStackTrace(System.out.printf("not found"));
//		}
//	}
	
	
}