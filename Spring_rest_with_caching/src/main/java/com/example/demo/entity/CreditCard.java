package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Gowse_Creditcard")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {
	
	@Id
	@Column(name = "card_Number")
	private long cardNumber;
	
	@Column(name = "card_Holder_Name")
	private String cardHolderName;
	
	@Column(name = "credit_Limit")
	private double creditLimit;

}
