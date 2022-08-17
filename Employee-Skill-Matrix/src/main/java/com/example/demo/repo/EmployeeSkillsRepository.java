package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.EmployeeSkills;

public interface EmployeeSkillsRepository extends JpaRepository<EmployeeSkills, Integer> {
	
	@Query(nativeQuery = true, value ="select * from Gowshick_Employee_Skills where skill_name=:name or skill_experience=:name1")
	public EmployeeSkills findBySkillNameOrExperince(@Param("name") String entity,@Param("name1") int entity1);

	@Query(nativeQuery = true, value ="select * from Gowshick_Employee_Skills where approved_by=:name or status=:name1")
	public EmployeeSkills findByEmpNameOrApprovedBy(@Param("name")String entity,@Param("name1") String entity1);

	public EmployeeSkills findBySkillName(String entity);

	public EmployeeSkills findBySkillExperience(int entity);

	public EmployeeSkills findByStatus(String entity);

	public EmployeeSkills findByApprovedBy(String entity);

	
	
}
