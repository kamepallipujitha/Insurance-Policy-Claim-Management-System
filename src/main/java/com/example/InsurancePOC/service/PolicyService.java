package com.example.InsurancePOC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InsurancePOC.model.Policy;
import com.example.InsurancePOC.repository.PolicyRepository;

@Service
public class PolicyService {
@Autowired
PolicyRepository policyrepo;

public Policy savePolicy(Policy policy) {
	return policyrepo.save(policy);
}
public List<Policy> getAllPolicy(){
	return policyrepo.findAll();
}
public Policy FindId(Integer id) {
	return policyrepo.findById(id).orElse(null);
}
}
