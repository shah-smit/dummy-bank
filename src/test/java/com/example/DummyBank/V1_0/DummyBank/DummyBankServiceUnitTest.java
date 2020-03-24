package com.example.DummyBank.V1_0.DummyBank;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DummyBankServiceUnitTest {

    private DummyBankService dummyBankServiceAdaptor;

    @BeforeEach
    public void setUp(){
        this.dummyBankServiceAdaptor = new DummyBankServiceAdaptor();
    }

    @Test
    public void whenGetCustomerProfileWithUsernameReturnCustomer(){
        Customer customer = dummyBankServiceAdaptor.getCustomerProfile("ValidUsername");

        assertNotNull(customer);
    }
}
