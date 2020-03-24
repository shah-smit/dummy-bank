package com.example.DummyBank.resource;

import com.example.DummyBank.V1_0.DummyBank.Customer;
import com.example.DummyBank.V1_0.DummyBank.DummyBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private DummyBankService service;

    @GetMapping("/profile/{username}")
    public Customer getCustomerProfile(String username){
        return service.getCustomerProfile(username);
    }
}
