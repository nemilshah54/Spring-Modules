package com.nemil.springaop.FlightManagementApp.DAO;

import com.nemil.springaop.FlightManagementApp.Passenger;

public interface PassengerDao {

    public Passenger getPassenger(int id);
    public boolean insert(Passenger passenger);
}
