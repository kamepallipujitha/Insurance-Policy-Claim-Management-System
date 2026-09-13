package com.example.InsurancePOC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.InsurancePOC.model.CustomerPolicy;
import com.example.InsurancePOC.service.CustomerpolicyService;

@RestController
@RequestMapping("/api/customerpolicy")
public class CustomerPolicyController {
@Autowired
CustomerpolicyService cpservice;

@PostMapping("/buy")
public CustomerPolicy insertData(@RequestBody CustomerPolicy customerpolicy) {
	return cpservice.insertData(customerpolicy);
}

@GetMapping("/getall")
public List<CustomerPolicy> findAllCustomer(){
	return cpservice.findAllCustomer();
}
@GetMapping("{id}")
public CustomerPolicy FindById(@PathVariable Long id) {
	return cpservice.FindById(id);
}

}
