package com.nemil.springaop.FlightManagementApp;

//import com.nemil.springaop.FlightManagementApp.Aspects.FlightAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses = {})
public class JavaConfig {

//    @Bean
//    public FlightAspect flightAspect(){
//        return new FlightAspect();
//    }

    @Bean
    public Flight getFlight(){
        Flight flight = new Flight();
        flight.setId("A12345");
        flight.setCompany("American Airlines");

        List<Passenger> passengerList = new ArrayList<>();

        Passenger p1 = new Passenger();
        p1.setCountry("USA");
        p1.setName("Nemil");
        p1.setSSN(1);

        Passenger p2 = new Passenger();
        p2.setSSN(1);
        p2.setName("Shrey");
        p2.setCountry("India");

        passengerList.add(p1);
        passengerList.add(p2);

        flight.setFlightPassengers(passengerList);
        return flight;
    }
}
