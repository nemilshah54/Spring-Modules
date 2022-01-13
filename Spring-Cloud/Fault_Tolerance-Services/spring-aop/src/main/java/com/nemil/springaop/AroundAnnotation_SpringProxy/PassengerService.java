package com.nemil.springaop.AroundAnnotation_SpringProxy;

import com.nemil.springaop.AroundAnnotation_SpringProxy.Passenger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassengerService {

    public Passenger runPassengerService(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop3.xml");

        PassengerRepo passengerRepo = (PassengerRepo) context.getBean("passengerRepo");

        context.close();
        return passengerRepo.getPassengerById(1);
    }
}
