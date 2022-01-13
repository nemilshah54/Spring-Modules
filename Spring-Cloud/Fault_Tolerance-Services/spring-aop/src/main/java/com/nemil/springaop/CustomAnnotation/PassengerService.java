package com.nemil.springaop.CustomAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassengerService {

    public Passenger runPassengerService(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop4.xml");

        PassengerRepo passengerRepo = (PassengerRepo) context.getBean("passengerRepo");

        context.close();
        return passengerRepo.getPassengerById(1);
    }
}
