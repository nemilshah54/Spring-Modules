package com.nemil.springaop.FlightManagementApp.Exceptions;

public class CountryDoesNotExist extends RuntimeException {

    private String countryCode;

    public String getCountryCode() {
        return countryCode;
    }

    public CountryDoesNotExist(String countryCode) {
        this.countryCode = countryCode;
    }
}
