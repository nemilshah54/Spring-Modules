package com.nemil.springaop.ExceptionAspect;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassengerService {

    public Passenger runPassengerService(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop5.xml");

        PassengerRepo passengerRepo = (PassengerRepo) context.getBean("passengerRepo");

        context.close();
        return passengerRepo.getPassengerById(0);
    }
}
