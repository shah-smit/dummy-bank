package com.example.DummyBank.V1_0.DummyBank;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DummyBankServiceAdaptor implements DummyBankService{

    @Override
    public Customer getCustomerProfile(String username) {
        return Customer.builder().build();
    }
}
