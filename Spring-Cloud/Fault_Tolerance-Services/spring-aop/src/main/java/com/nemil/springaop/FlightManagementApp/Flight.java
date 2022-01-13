package com.nemil.springaop.FlightManagementApp;

import org.springframework.stereotype.Component;

import java.util.List;


public class Flight {

    private String id;
    private String company;
    private List<Passenger> flightPassengers;

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", company='" + company + '\'' +
               // ", flightPassengers=" + flightPassengers +
                '}';
    }

    public void print(){
        System.out.println("Flight "+ company + " has following passengers: ");

        for (Passenger passenger: flightPassengers){
            System.out.println(passenger);
        }
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
//
    public List<Passenger> getFlightPassengers() {
        return flightPassengers;
    }

    public void setFlightPassengers(List<Passenger> flightPassengers) {
        this.flightPassengers = flightPassengers;
    }
}
