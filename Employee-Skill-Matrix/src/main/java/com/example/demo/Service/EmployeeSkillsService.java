package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.entity.EmployeeSkills;
import com.example.demo.repo.EmployeeSkillsRepository;

@Service
public class EmployeeSkillsService {

	@Autowired
	private EmployeeSkillsRepository repo;
	
	@Autowired
	private EmployeeDetailsService details;
	
	//api-7
	public EmployeeSkills findBySkillName(String entity)
	{
		return this.repo.findBySkillName(entity);
	}
	
	
	public EmployeeSkills findBySkillExperience(int entity)
	{
		return this.repo.findBySkillExperience(entity);
	}
	
	
	public EmployeeSkills findBySkillNameOrExperince(String entity,int entity1)
	{
		return this.repo.findBySkillNameOrExperince(entity, entity1 );
	}
	
	//api-8
	public EmployeeSkills findByStatus(String entity)
	{

		return this.repo.findByStatus(entity);
	}
	
	public EmployeeSkills findByApprovedBy(String entity)
	{
		
		return this.repo.findByApprovedBy(entity);
	}
	
	public EmployeeSkills findByEmpNameOrApprovedBy(String entity,String entity1)
	{
		
		return this.repo.findByEmpNameOrApprovedBy(entity, entity1);
	}
	
//	public void findByEmpName(String name)
//	{
//		
//		this.details.findbySkill();
//	}
//	
	
	//findAll
	public List<EmployeeSkills> findAll()
	{
		return this.repo.findAll();
	}
	

}
