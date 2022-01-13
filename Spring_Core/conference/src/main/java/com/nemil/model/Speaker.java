package com.nemil.model;

public class Speaker {

    private String firstName;
    private String lastName;
    private double seedNum;

    public double getSeedNum() {
        return seedNum;
    }

    public void setSeedNum(double seedNum) {
        this.seedNum = seedNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Speaker{" +










































































































                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", seedNum=" + seedNum +
                '}';
    }
}
