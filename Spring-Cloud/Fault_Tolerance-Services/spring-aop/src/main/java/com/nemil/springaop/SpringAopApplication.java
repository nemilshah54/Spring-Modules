package com.nemil.springaop;

import com.nemil.springaop.FlightManagementApp.FlightService;
import com.nemil.springaop.FlightManagementApp.Flyer.FlyerTestDeclarative;
import com.nemil.springaop.FlightManagementApp.FlyerTest;

//@SpringBootApplication
public class SpringAopApplication {

    public static void main(String[] args) {

//    //    SpringApplication.run(SpringAopApplication.class, args);
//        PassengerService passengerService = new PassengerService();
//
//        Passenger passenger =  passengerService.runPassengerService();
//
//        System.out.println(passenger.getName());


//        FlyerTest flyerTest = new FlyerTest();
//        flyerTest.flyerTest();

        FlyerTestDeclarative flyerTestDeclarative = new FlyerTestDeclarative();
        flyerTestDeclarative.flyerTest();
//        FlightService flightService = new FlightService();
//        flightService.processFlight();

    }

}
