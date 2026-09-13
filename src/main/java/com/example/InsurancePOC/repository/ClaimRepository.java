package com.example.InsurancePOC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.InsurancePOC.model.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Long> {

}
