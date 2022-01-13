package com.nemil.springaop.Example2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassengerService {

    public static int x = 1;

    public Passenger runPassengerService(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop1.xml");

        PassengerRepo passengerRepo = (PassengerRepo) context.getBean("passengerRepo");



        Passenger p = passengerRepo.getPassengerById(5);
      //  context.close();
        return p;
     //   return null;
    }

    public void show(int x){
        System.out.println("Yesmskfdlf");
    }
}
