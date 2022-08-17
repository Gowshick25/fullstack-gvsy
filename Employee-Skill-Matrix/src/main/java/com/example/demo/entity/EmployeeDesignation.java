package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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
@Table(name = "Gowshick_Employee_Designation")
public class EmployeeDesignation {
	
	@Id
	@SequenceGenerator( name = "empskillsid",allocationSize = 1,initialValue = 301)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "empskillsid")
	@Column(name = "emp_designation_id")
	int empDesignationId;
	
	@Column(name = "emp_designation")
	String empDesignation;

}
