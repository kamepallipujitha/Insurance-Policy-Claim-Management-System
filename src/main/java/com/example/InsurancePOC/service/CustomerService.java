package com.example.InsurancePOC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InsurancePOC.model.Customer;
import com.example.InsurancePOC.repository.CustomerRepo;

@Service
public class CustomerService {
@Autowired
CustomerRepo customerrepo;

public Customer saveCustomer(Customer customer) {
	return customerrepo.save(customer);
}

public List<Customer> getAllUser(){
	return customerrepo.findAll();
}

public Customer getCustomerById(Long id) {
	return customerrepo.findById(id).orElse(null);
}
}
