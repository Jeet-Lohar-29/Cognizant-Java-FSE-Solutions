package com.cognizant.payment_service.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @CircuitBreaker(name = "paymentService", fallbackMethod = "paymentFallback")
    public String processPayment() {

        throw new RuntimeException("Third Party Payment Gateway is Down");

    }

    public String paymentFallback(Exception ex) {

        System.out.println("Fallback Executed : " + ex.getMessage());

        return "Payment Service is temporarily unavailable. Please try again later.";

    }

}