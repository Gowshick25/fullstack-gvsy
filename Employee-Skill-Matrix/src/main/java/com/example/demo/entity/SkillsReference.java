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
@Table(name = "Gowshick_Skills_Refernce")
public class SkillsReference {
	
	@Id
	@SequenceGenerator( name = "skillid",allocationSize = 1,initialValue = 101)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "skillid")
	@Column(name = "skill_id")
	int skillId;
	
	@Column(name = "skill_type")
	String skillType;
	
	@Column(name = "skill_name")
	String skillName;
	
	@Column(name = "created_date")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate createdDate;
	
	@Column(name = "created_by")
	String createdBy;
	
	@Column(name = "created_time")
	@DateTimeFormat(iso = ISO.TIME)
	LocalDate createdTime;


}
