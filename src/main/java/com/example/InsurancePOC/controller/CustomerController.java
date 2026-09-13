package com.example.InsurancePOC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.InsurancePOC.model.Customer;
import com.example.InsurancePOC.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
@Autowired
CustomerService customerservice;


@PostMapping("/insert")
public Customer saveCustomer(@RequestBody Customer customer) {
	return customerservice.saveCustomer(customer);
}
@GetMapping("/getcustomer")
public List<Customer> getAllUser(){
	return customerservice.getAllUser();
}
@GetMapping("/{id}")
public Customer getCustomerById(@PathVariable Long id) {
	return customerservice.getCustomerById(id);
}
}
