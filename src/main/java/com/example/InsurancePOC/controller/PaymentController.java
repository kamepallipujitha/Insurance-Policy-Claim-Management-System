package com.example.InsurancePOC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.InsurancePOC.model.Payment;
import com.example.InsurancePOC.service.PaymentService;

@RestController
public class PaymentController {
@Autowired
PaymentService paymentservice;
@PostMapping("/pay")
public Payment makePayment(@RequestBody Payment payment) {
return paymentservice.makePayment(payment);	
}
}
