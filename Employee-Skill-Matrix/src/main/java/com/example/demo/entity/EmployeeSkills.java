package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
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
@Table(name = "Gowshick_Employee_Skills")
public class EmployeeSkills {
	
	@Id
	@SequenceGenerator( name = "empskillid",allocationSize = 1,initialValue = 201)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "empskillid")
	@Column(name = "emp_skills_id")
	int empSkillsId;
	
	@Column(name = "emp_id")
	int empId;
	
	@Column(name = "skill_id")
	int skillId;
	
	@Column(name = "skill_name")
	String skillName;
	
	@Column(name = "skill_experience")
	int skillExperience;
	
	@Column(name = "status")
	String status;
	
	@Column(name = "approved_by")
	String approvedBy;

	@Column(name = "approved_date")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate approvedDate;
	
	@Column(name = "created_date")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate createdDate;
	
	@Column(name = "modified_date")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate modifiedDate;
}
