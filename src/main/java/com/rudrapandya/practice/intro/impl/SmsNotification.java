package com.rudrapandya.practice.intro.impl;

import com.rudrapandya.practice.intro.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
//@ConditionalOnProperty(name = "notification.type" , havingValue = "sms")
public class SmsNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending sms notification..." + message);
    }
}
