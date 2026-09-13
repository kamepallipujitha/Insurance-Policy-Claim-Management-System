package com.example.InsurancePOC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.InsurancePOC.model.Policy;
import com.example.InsurancePOC.service.PolicyService;

@RestController
@RequestMapping("/api/policy")
public class PolicyController {
@Autowired
PolicyService policyservice;



@PostMapping("insertpolicy")
public Policy savepolicy(@RequestBody Policy policy) {
	return policyservice.savePolicy(policy);
}

@GetMapping("/get")
public List<Policy> getAllPolicy() {
	return policyservice.getAllPolicy();
}
@GetMapping("{id}")
public Policy FindID(@PathVariable Integer id) {
	return policyservice.FindId(id);
}
}
