package com.nemil.springaop.FlightManagementApp;

public class Passenger {

    int SSN;
    String name;
    String country;

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "SSN=" + SSN +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
