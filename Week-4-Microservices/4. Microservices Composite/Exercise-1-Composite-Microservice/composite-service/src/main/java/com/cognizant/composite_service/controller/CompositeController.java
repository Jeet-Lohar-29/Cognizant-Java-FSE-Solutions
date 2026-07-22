package com.cognizant.composite_service.controller;

import com.cognizant.composite_service.model.Account;
import com.cognizant.composite_service.model.CustomerDetails;
import com.cognizant.composite_service.model.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class CompositeController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/customer/{accountNo}/{loanNo}")
    public CustomerDetails getCustomerDetails(
            @PathVariable String accountNo,
            @PathVariable String loanNo) {

        Account account = restTemplate.getForObject(
                "http://localhost:8080/accounts/" + accountNo,
                Account.class);

        Loan loan = restTemplate.getForObject(
                "http://localhost:8081/loans/" + loanNo,
                Loan.class);

        return new CustomerDetails(account, loan);
    }
}