package com.example.InsurancePOC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InsurancePOC.model.Claim;
import com.example.InsurancePOC.model.CustomerPolicy;
import com.example.InsurancePOC.model.Policy;
import com.example.InsurancePOC.repository.ClaimRepository;
import com.example.InsurancePOC.repository.CustomerPolicyRepository;
import com.example.InsurancePOC.repository.PolicyRepository;

@Service
public class ClaimService {
@Autowired
ClaimRepository claimrepo;

@Autowired
CustomerPolicyRepository cprepo;

@Autowired
PolicyRepository policyrepo;

public Claim raiseClaim(Claim claim) {
	claim.setStatus("PENDING");
	return claimrepo.save(claim);
}

public Claim validateClaim(Long id) {
	Claim claim=claimrepo.findById(id).orElse(null);
	if(claim==null) {
		return null;
	}
	CustomerPolicy customerpolicy=cprepo.findById(claim.getCustomerPolicyId()).orElse(null);
	
	if(customerpolicy==null) {
		claim.setStatus("REJECTED");
		return claimrepo.save(claim);
	}
	if(!customerpolicy.getStatus().equals("ACTIVE")) {
		claim.setStatus("REJECTED");
		return claimrepo.save(claim);
	}
	Policy policy=policyrepo.findById(customerpolicy.getPolicyId()).orElse(null);
		
	if(policy==null) {
		claim.setStatus("REJECTED");
		return claimrepo.save(claim);
	}
	if(claim.getClaimAmount()<=policy.getCoverageAmount()) {
		claim.setStatus("APPROVED");
	}else {
		claim.setStatus("REJECTED");
	}
	return claimrepo.save(claim);
}
}
