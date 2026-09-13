package com.example.InsurancePOC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InsurancePOC.model.CustomerPolicy;
import com.example.InsurancePOC.repository.CustomerPolicyRepository;

@Service
public class CustomerpolicyService {
@Autowired

CustomerPolicyRepository cprepo;


public CustomerPolicy insertData(CustomerPolicy customerpolicy) {
	return cprepo.save(customerpolicy);
}
public List<CustomerPolicy> findAllCustomer(){
	return cprepo.findAll();
}
public CustomerPolicy FindById(Long id) {
	return cprepo.findById(id).orElse(null);
}
public CustomerPolicy updateStatus(Long id,String status) {
	CustomerPolicy customerpolicy=cprepo.findById(id).orElse(null);
	if(customerpolicy!=null) {
		customerpolicy.setStatus(status);
		return cprepo.save(customerpolicy);
	}
	
	return null;
	
}
}
