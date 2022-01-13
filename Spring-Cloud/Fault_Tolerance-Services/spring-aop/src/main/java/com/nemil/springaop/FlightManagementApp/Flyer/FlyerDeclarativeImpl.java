package com.nemil.springaop.FlightManagementApp.Flyer;

// Declarative Approach.
public class FlyerDeclarativeImpl implements Flyer {

    @Override
    public void takeOff() {
        System.out.println("Taking off");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void land() {

        System.out.println("Landing...");
    }
}
