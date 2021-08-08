package com.example.jpaunrelatedentities.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.jpaunrelatedentities.dao.entity.Lender;
import com.example.jpaunrelatedentities.dao.entity.MortgageEligibility;

public interface LenderRepository extends JpaRepository<Lender, Long>{

	@Query("Select new com.example.jpaunrelatedentities.dao.entity.MortgageEligibility "
			+ "(L.lenderAddress, L.lenderName,C.creditScore, C.downPayment, C.firstName, C.lastName, C.phone) "
			+ "From Lender L ,Customer C "
			+ "Where C.creditScore > 7 and C.downPayment > 20000")
	List<MortgageEligibility> findMortgageEligibility();
	
}
