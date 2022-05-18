package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Passenger;
import com.example.demo.entity.PassengerRepo;


@Service
public class PassengerService {

	private PassengerRepo repo;

    @Autowired
	public PassengerService(PassengerRepo repo) {
		super();
		this.repo = repo;
	}
    
	public List<Passenger> findAll() {
		return this.repo.findAll();
	}

	public Passenger add(Passenger entity) {
		return this.repo.save(entity);
	}
	
	public List<Passenger> getByPassengerName(@Param("passName") String passName)
	{
	return this.repo.getByPassengerName(passName);
	}
	
	public List<Passenger> srchByTripDateTime(LocalDateTime tripDate) {
		return this.repo.findByTripListTripDateTime(tripDate);
	}

}
