package com.example.jpaunrelatedentities.dao.entity;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity(name = "Customer")
@Table(name = "customer")
public class Customer {
    @Id
    @SequenceGenerator(name = "customer_sequence",sequenceName = "customer_sequence",allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "customer_sequence")
    @Column(name = "customer_id")
    private Long customer_id;
    private String firstName;
    private String lastName;
    private String phone;
    private double  creditScore;
    private double downPayment;
	public Customer(String firstName, String lastName, String phone, double creditScore, double downPayment) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.creditScore = creditScore;
		this.downPayment = downPayment;
	}
    
    
}
