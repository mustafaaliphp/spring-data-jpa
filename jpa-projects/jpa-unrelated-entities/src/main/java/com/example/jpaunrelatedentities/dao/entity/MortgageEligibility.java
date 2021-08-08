package com.example.jpaunrelatedentities.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MortgageEligibility {

	private String lenderAddress;
	private String lenderName;
	private double creditScore;
	private double downPayment;
	private String firstName;
	private String lastName;
	private String phone;

}
