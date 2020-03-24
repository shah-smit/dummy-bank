package com.example.DummyBank.V1_0.DummyBank;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class Customer {

    private String name;
    private double totalBalance;
    private LocalDateTime dateJoined;
}
