package com.nemil.springaop.FlightManagementApp;

import com.nemil.springaop.FlightManagementApp.DAO.PassengerDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FlightService {

    public void processFlight(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("flightManagementApp.xml");

        Flight flight = (Flight)context.getBean("flight");

    //    flight.print();
//        System.out.println("Flight ID: " + flight.getId());
//        flight.setId("AA1996");
//
//        System.out.println("List of all passengers from flight: "+ flight.getCompany());
//
//        for( Passenger passenger: flight.getFlightPassengers()){
//            passenger.print();
//        }
//
//        Ticket ticket = (Ticket) context.getBean("ticket");
//        ticket.setNumber("02141996");

     //   PassengerDao passengerDaoImpl = (PassengerDao)context.getBean("passengerDAOImpl");
    //    passengerDaoImpl.getPassenger(1);
   //     passengerDaoImpl.getPassenger(1);
//        System.out.println(passengerDaoImpl.getPassenger(1));
//        System.out.println(passengerDaoImpl.getPassenger(1));
//        System.out.println(passengerDaoImpl.getPassenger(1));
//        System.out.println(passengerDaoImpl.getPassenger(1));
//        System.out.println(passengerDaoImpl.getPassenger(2));
//        System.out.println(passengerDaoImpl.getPassenger(2));

//        p1.setName("he");
//        p1.setCountry("hello");
//        passengerDaoImpl.insert(p1);
//
//        context.close();   Passenger p1 = new Passenger();
//        p1.setSSN(11);

        context.close();
    }
}
