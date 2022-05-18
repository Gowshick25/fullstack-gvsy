package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table (name = "Gowse_Trip")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TripHistory {
	
	@Id
	@Column(name = "trip_Id")
	int tripId;
	
	@Column(name = "trip_Date_Time")
	LocalDateTime tripDateTime;
	
	@Column(name = "starting_Point")
	String startingPoint;
	
	@Column(name = "destination")
	String destination;
	
	@Column(name = "amount")
	double amount;

}
