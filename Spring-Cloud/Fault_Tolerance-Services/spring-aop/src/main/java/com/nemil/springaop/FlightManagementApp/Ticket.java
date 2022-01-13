package com.nemil.springaop.FlightManagementApp;

// Most Sensitive Object. Please keep track (logg) whenever any method from this class is called.
public class Ticket {

    String number;
    Passenger passenger;

    public String emittingCountry(){
        return passenger.getCountry();
    }
    @Override
    public String toString() {
        return "Ticket Number: " + number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
