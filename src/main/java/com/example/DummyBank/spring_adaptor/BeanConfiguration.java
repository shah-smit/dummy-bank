package com.example.DummyBank.spring_adaptor;

import com.example.DummyBank.V1_0.DummyBank.DummyBankService;
import com.example.DummyBank.V1_0.DummyBank.DummyBankServiceAdaptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public DummyBankService transferService() {
        return new DummyBankServiceAdaptor();
    }
}
