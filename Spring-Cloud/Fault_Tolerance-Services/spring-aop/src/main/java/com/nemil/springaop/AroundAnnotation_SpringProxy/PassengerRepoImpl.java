package com.nemil.springaop.AroundAnnotation_SpringProxy;

import com.nemil.springaop.AroundAnnotation_SpringProxy.Passenger;

import java.util.HashMap;
import java.util.Map;

public class PassengerRepoImpl implements PassengerRepo {

    // Mocking database.
    private static Map<Integer, Passenger> passengerMap = new HashMap<>();

    @Override
    public Passenger getPassengerById(int id) {
        if(passengerMap.get(id)!=null){
            return passengerMap.get(id);
        }

        Passenger passenger = new Passenger();
        passenger.setId(id);
        passenger.setName("Passenger " + id);

        // Upload passenger in mock database.
        passengerMap.put(id,passenger);
        return passengerMap.get(id);
    }
}
