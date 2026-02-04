package com.rudrapandya.practice.intro;

import com.rudrapandya.practice.intro.impl.SmsNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class IntroApplication implements CommandLineRunner {

    //@Autowired
//    final NotificationService notificationServiceObj;
//
//    public IntroApplication(NotificationService notificationServiceObj) {
//        this.notificationServiceObj = notificationServiceObj;
//    }

    @Autowired
    Map<String, NotificationService>  notificationServices = new HashMap<>();

    public IntroApplication(Map<String, NotificationService> notificationServices) {}
    public static void main(String[] args) {

        SpringApplication.run(IntroApplication.class, args);

	}

    @Override
    public void run(String... args) throws Exception {

        //notificationServiceObj.send("hello");
        for(var notificationService : notificationServices.entrySet()) {
            System.out.println(notificationService.getKey());
            notificationService.getValue().send("hello");
        }
    }
}
