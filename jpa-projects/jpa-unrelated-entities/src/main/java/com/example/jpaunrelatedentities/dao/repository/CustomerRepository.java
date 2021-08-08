package com.example.jpaunrelatedentities.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaunrelatedentities.dao.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
