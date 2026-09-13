package com.example.InsurancePOC.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.InsurancePOC.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

	Optional<Customer> findById(Long id);

}
