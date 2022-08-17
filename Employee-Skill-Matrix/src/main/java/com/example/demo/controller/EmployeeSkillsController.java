package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.EmployeeSkillsService;
import com.example.demo.entity.EmployeeSkills;

@RestController
@RequestMapping (path = "/api/v1/skills")
public class EmployeeSkillsController {
    
	@Autowired
	private EmployeeSkillsService service;
	
	//api-7
	@GetMapping (value = "/skillname/{name}")
	public EmployeeSkills findBySkillName(@PathVariable("name")String entity)
	{
		return service.findBySkillName(entity);
	}
	
	@GetMapping (value = "/skillexperience/{experience}")
	public EmployeeSkills findBySkillExperience(@PathVariable("experience")int entity)
	{
		return service.findBySkillExperience(entity);
	}
	
	@GetMapping (value = "/skillnameorexperince/{name}/{name1}")
	public EmployeeSkills findByEmpSkillNameOrExperince(@PathVariable("name") String entity,@PathVariable("name1")int entity1)
	{
		return service.findBySkillNameOrExperince(entity, entity1);
	}
	
	//api-8
	@GetMapping (value = "/skillstatus/{name}")
	public EmployeeSkills findByStatus(@PathVariable("status")String entity)
	{
		
		return service.findByStatus(entity);
	}
	
	@GetMapping (value = "/skillapprovedby/{name}")
	public EmployeeSkills findByApprovedBy(@PathVariable("approvedBy")String entity)
	{
		
		return service.findByApprovedBy(entity);
	}
	@GetMapping (value = "/skillempNameorapprovedby/{name}/{name1}")
	public EmployeeSkills findByEmpNameOrApprovedBy(@PathVariable("name") String entity,@PathVariable("name1")String entity1)
	{
		return service.findByEmpNameOrApprovedBy(entity, entity1);
	}
	
	
//	@GetMapping (value = "/skill/{name}")
//	public void findByEmpName(String name)
//	{
//		service.findByEmpName(name);
//	}
	
	
	@GetMapping (value = "/findall")
	public List<EmployeeSkills> findAll()
	{
		return service.findAll();
	}
	
}
