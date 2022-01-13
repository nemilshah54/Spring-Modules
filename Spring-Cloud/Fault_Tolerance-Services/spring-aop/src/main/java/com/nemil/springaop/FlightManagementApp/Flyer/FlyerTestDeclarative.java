package com.nemil.springaop.FlightManagementApp.Flyer;


import com.nemil.springaop.FlightManagementApp.Flight;
import com.sun.xml.internal.ws.developer.UsesJAXBContext;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplicationExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class FlyerTestDeclarative {

    public void flyerTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("flightManagementApp.xml");

        Flight flight = (Flight) context.getBean("flight");

        if(flight instanceof Flight){
            System.out.println("Test 1 Passed.");
            flight.print();
        }

        if(flight instanceof Flyer){
            System.out.println("Test 2. Passed.");
           ((Flyer) flight).takeOff();
           ((Flyer) flight).fly();
           ((Flyer) flight).land();
        }

    }
}
