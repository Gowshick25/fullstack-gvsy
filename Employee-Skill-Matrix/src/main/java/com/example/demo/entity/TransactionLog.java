package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "Gowshick_Transaction_Log")
public class TransactionLog {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "transaction_id")
	int transactionId;
	
	@Column(name = "user_login_id")
	int userLoginId;
	
	@Column(name = "api_Operation_name")
	String apiOperationName;
	
	@Column(name = "last_name")
	String request;
	
	@Column(name = "password")
	String response;
	
	@Column(name = "created_time")
	@DateTimeFormat(iso = ISO.TIME)
	LocalDate createdTime;
	
	@Column(name = "created_date")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate createdDate;
	
}
