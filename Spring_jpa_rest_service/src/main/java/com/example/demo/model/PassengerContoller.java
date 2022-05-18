package com.example.demo.model;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.service.PassengerService;

@RestController
@RequestMapping(path = "/api/v1")
public class PassengerContoller {
	
	
	private PassengerService service;

	@Autowired
	public PassengerContoller(PassengerService service) {
		super();
		this.service = service;
	}
	@GetMapping(path= "/passengers")
	public List<Passenger> getAllPassengers(){
		
		return this.service.findAll();
		
	}
	
	@PostMapping(path = "/passengers")
	public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger entity){
		
		Passenger passenger = this.service.add(entity);
		
		URI location=
		           ServletUriComponentsBuilder
		          .fromCurrentRequest()				
		         .path("/{id}")							
		          .buildAndExpand(entity.getPassengerId())	
		          .toUri();  
		
		return ResponseEntity.created(location).body(passenger);  
	}

   @GetMapping(path= "/passengers/name/{name}")
   public List<Passenger> getAllPassengers(@PathVariable("name")String passName){
	
	return this.service.getByPassengerName(passName);
	
   }
   
   @GetMapping(path= "/passengers/date/{tripListTripDateTime}")
	public List<Passenger> getByTripListTripDateTime(@PathVariable("tripListTripDateTime")
	@DateTimeFormat(iso=ISO.DATE_TIME)LocalDateTime dateTime){
		
		return this.service.srchByTripDateTime(dateTime);
		
	
}
}
	
	
	

