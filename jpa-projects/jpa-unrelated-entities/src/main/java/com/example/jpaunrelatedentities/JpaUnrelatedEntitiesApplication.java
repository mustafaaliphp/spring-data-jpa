package com.example.jpaunrelatedentities;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.jpaunrelatedentities.dao.entity.Customer;

import com.example.jpaunrelatedentities.dao.entity.Lender;
import com.example.jpaunrelatedentities.dao.entity.MortgageEligibility;
import com.example.jpaunrelatedentities.dao.repository.CustomerRepository;

import com.example.jpaunrelatedentities.dao.repository.LenderRepository;

@SpringBootApplication
public class JpaUnrelatedEntitiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaUnrelatedEntitiesApplication.class, args);
	}

	 @Bean
	    CommandLineRunner commandLineRunner(LenderRepository lenderRepository, CustomerRepository customerRepository) {
	        return args -> {
//	        	Lender lender1 = new Lender(
//	                    "Lender1",
//	                    "Chicago"
//	            );
//
//	        	Lender lender2 = new Lender(
//	                    "lender2",
//	                    "Worth"
//	            );
//	        	Customer customer1 = new Customer(
//	        			"Mustafa",
//	        			"Ali",
//	        			"7082000001",
//	        			7.5,
//	        			30000
//	        			);
//	        	Customer customer2 = new Customer(
//	        			"Tahani",
//	        			"Bader",
//	        			"7082000002",
//	        			8,
//	        			20000
//	        			);	
//	        	Customer customer3 = new Customer(
//	        			"Leah",
//	        			"Ali",
//	        			"7082000003",
//	        			6,
//	        			30000
//	        			);
//	        	lenderRepository.saveAll(List.of(lender1, lender2));
//	        	customerRepository.saveAll(List.of(customer1, customer2, customer3));
	        	List<MortgageEligibility> mortgageEligibility;
	        	mortgageEligibility = lenderRepository.findMortgageEligibility();
	        	for (int i = 0; i < mortgageEligibility.size(); i++) {
	        	    System.out.println(mortgageEligibility.get(i));
	        	}
	        	
	        
};
}
}