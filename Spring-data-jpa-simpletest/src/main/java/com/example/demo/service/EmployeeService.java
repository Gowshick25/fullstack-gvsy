package com.example.demo.service;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;



@Service
public class EmployeeService{
	
	private EmployeeRepository repo;
	
	@Autowired
	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Employee add(Employee entity) {
		
		return this.repo.save(entity);
	}
	public List<Employee> findAll(){
		
		return this.repo.findAll();
	}
    public List<Employee> findByEmployeeLoc(String srchString){
		
		return (List<Employee>) this.repo.findByLocation(srchString);
	
	}
    
    public List<Employee> findByEmployeeSkill(String srchString){
		
		return (List<Employee>) this.repo.findBySkillSet(srchString);
		

	}
    
    
 public List<Employee> findBydateofbirth(LocalDate date){
	 
		return (List<Employee>) this.repo.findByDateOfBirth(date);
	
	}
    
    public List<Employee> findByskillSetAndLoc(@Param("skillSet") String skillSet,@Param("loc") String loc){
		
		return this.repo.getByskillSetLocation(skillSet, loc);
	
	}
    

}