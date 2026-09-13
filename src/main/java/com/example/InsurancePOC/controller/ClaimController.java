package com.example.InsurancePOC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.InsurancePOC.model.Claim;
import com.example.InsurancePOC.service.ClaimService;

@RestController
@RequestMapping("/api")
public class ClaimController {
@Autowired
ClaimService claimservice;

@PostMapping("/claim")
public Claim raiseClaim(@RequestBody Claim claim) {
return claimservice.raiseClaim(claim);
}

@GetMapping("validate/{id}")
public Claim validateClaim(@PathVariable Long id) {
	return claimservice.validateClaim(id);
}
}
