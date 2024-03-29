package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TripDetail;
import com.example.demo.service.TripDetailService;

@RestController
@RequestMapping(path = "/api/v1/trips")
public class TripDetailController {
	
	@Autowired
	public TripDetailService service;

	public TripDetailController(TripDetailService service) {
		super();
		this.service = service;
	}
	

	@GetMapping(value = "/findById/{id}")
	public Optional<TripDetail> findById(@PathVariable("id") int id)
	{
		return this.service.findById(id);
	}
	
	@GetMapping
	public List<TripDetail> findAll()
	{
		return this.service.findAll();
	}
	
	@PostMapping
	public TripDetail save(@RequestBody TripDetail entity)
	{
		return this.service.save(entity);
	}

	@GetMapping(value = "/srch/{id}")
	public Optional<TripDetail> findByDriverId(@PathVariable("id") int id)
	{
		return this.service.findByDriverId(id);
	}
	
}
