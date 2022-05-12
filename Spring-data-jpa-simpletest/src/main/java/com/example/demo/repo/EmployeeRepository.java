package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	public List<Employee> findByLocation(String srch); 
	
	 public List<Employee> findBySkillSet(String srchString);
	 
	 public List<Employee> findByDateOfBirth(LocalDate date);
	 
		@Query(nativeQuery=true,
				value="select * from gowshick_Employee  where skill_set=:skillSet AND location=:loc")
		public List<Employee> getByskillSetLocation (@Param("skillSet") String skillSet,@Param("loc") String loc);

}
