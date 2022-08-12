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
@Table(name = "Gowse_Trip_Detail")

public class TripDetail {
	
	@Id
	@Column(name = "trip_Id")
	int tripId;
	
	@Column(name = "driver_Id")
	int driverId;
	
	@Column(name = "trip_Date")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate tripDate;
	
	@Column(name = "amount")
	double amount;

}
