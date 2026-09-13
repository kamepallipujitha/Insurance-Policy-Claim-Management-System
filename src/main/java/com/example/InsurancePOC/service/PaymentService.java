package com.example.InsurancePOC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InsurancePOC.model.Payment;
import com.example.InsurancePOC.repository.PaymentRepository;

@Service
public class PaymentService {
@Autowired
PaymentRepository paymentrepo;

@Autowired
CustomerpolicyService cpservice;


public Payment makePayment(Payment payment) {
	payment.setStatus("SUCCESS");
	Payment savedPayment=paymentrepo.save(payment);
	if(savedPayment.getStatus().equals("SUCCESS")) {
		cpservice.updateStatus(savedPayment.getCustomerPolicyId(), "ACTIVE");
	}
	
	return savedPayment;
}
}
