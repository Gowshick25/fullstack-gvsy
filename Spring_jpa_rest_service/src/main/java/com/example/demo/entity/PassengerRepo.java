package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public interface PassengerRepo extends JpaRepository<Passenger, Integer> {

	@Query(nativeQuery=true,value="select * from Gowse_passenger  where passenger_Name=:passName ") 
	public List<Passenger> getByPassengerName (@Param("passName") String passName);
	
	public List<Passenger> findByTripListTripDateTime(LocalDateTime tripDate);

//	@Query(nativeQuery=true,value="select trip_Id, trip_Date_Time, starting_Point, destination, amount from Gowse_Trip  where trip_Date_Time=:tripDate ") 
//	public List<Passenger> findByTripListTripDateTime (@Param("tripDate")  LocalDateTime tripDate);
	
	
	



}
