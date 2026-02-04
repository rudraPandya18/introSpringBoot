package com.rudrapandya.practice.intro;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class PaymentService {

    public void pay(){
        System.out.println("Pay...");
    }

    @PostConstruct
    public void afterInit(){
        System.out.println("After Init...");
    }

    @PreDestroy
    public void beforeDestroy(){
        System.out.println("Before Destroy...");
    }
}
