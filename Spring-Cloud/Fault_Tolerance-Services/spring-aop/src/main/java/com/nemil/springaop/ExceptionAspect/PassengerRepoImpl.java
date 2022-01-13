package com.nemil.springaop.ExceptionAspect;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component("passengerRepo")
public class PassengerRepoImpl implements PassengerRepo {

    // Mocking database.
    private static Map<Integer, Passenger> passengerMap = new HashMap<>();

    @Override
    public Passenger getPassengerById(int id) {
        if(passengerMap.get(id)!=null){
            return passengerMap.get(id);
        }

        if(id<1) throw new RuntimeException("Id must be greater than 1");
        Passenger passenger = new Passenger();
        passenger.setId(id);
        passenger.setName("Passenger " + id);

        // Upload passenger in mock database.
        passengerMap.put(id,passenger);
        return passengerMap.get(id);
    }
}
