package com.example.demo.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "Gowshick_Employee_Details")
public class EmployeeDetails {
	
	@Id
	@Column(name = "emp_id")
	int empId;
	
	@Column(name = "emp_name")
	String empName;
	
	@Column(name = "emp_designation_id")
	int empDesignationId;
	
	@Column(name = "emp_doj")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate empDoj;
	
	//@OneToMany(targetEntity = EmployeeSkills.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	//@JoinColumn(name = "skill_ref")
	//private List<EmployeeSkills> skills;


}
