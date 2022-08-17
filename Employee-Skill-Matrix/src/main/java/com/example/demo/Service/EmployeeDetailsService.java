package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.EmployeeSkills;
import com.example.demo.repo.EmployeeDetailsRepository;

@Service
public class EmployeeDetailsService {
	
//	@Autowired
//	private EmployeeSkills skills;
	
	@Autowired
	private EmployeeDetailsRepository repo;
	
//	public void findbySkill()
//	{
//		this.skills.getSkillName();
//	}

}