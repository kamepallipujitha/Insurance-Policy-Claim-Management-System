package com.example.InsurancePOC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.InsurancePOC.model.CustomerPolicy;

public interface CustomerPolicyRepository extends JpaRepository<CustomerPolicy, Long> {

}
