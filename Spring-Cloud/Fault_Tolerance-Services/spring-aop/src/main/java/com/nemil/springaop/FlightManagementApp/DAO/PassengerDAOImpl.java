package com.nemil.springaop.FlightManagementApp.DAO;

import com.nemil.springaop.FlightManagementApp.Exceptions.CountryDoesNotExist;
import com.nemil.springaop.FlightManagementApp.Passenger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class PassengerDAOImpl implements PassengerDao{

    public static Map<Integer, Passenger> passengerMap = new HashMap<>();


    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private Map<Integer,Passenger> databasePassenger = new HashMap<>();

    public PassengerDAOImpl() {
        Passenger nemil = new Passenger();
        nemil.setName("nemil"); nemil.setSSN(1); nemil.setCountry("USA");
        databasePassenger.put(1,nemil);

        Passenger shrey = new Passenger();
        shrey.setName("shrey"); shrey.setSSN(2); shrey.setCountry("India");
        databasePassenger.put(2,shrey);
    }

    private RowMapper<Passenger> rowMapper = ((resultSet, rowNum) -> {
        Passenger passenger = new Passenger();
        passenger.setSSN(resultSet.getInt("SSN"));
        passenger.setName(resultSet.getString("Name"));
        passenger.setName(resultSet.getString("Country"));
        return passenger;
    });

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(this.dataSource);
    }

    private Passenger getById(int id){
        return databasePassenger.get(id);
    }

    public static Map<Integer, Passenger> getPassengerMap() {
        return passengerMap;
    }

    @Override
    public Passenger getPassenger(int id) {
        if(passengerMap.get(id)!= null){
            System.out.println("nemil");
            return passengerMap.get(id);
        }

        Passenger passenger = getById(id);
        return passenger;
    }

    @Override
    public boolean insert(Passenger passenger) {
        if(!Arrays.asList(Locale.getISOCountries()).contains(passenger.getCountry())){
            throw new CountryDoesNotExist(passenger.getCountry());
        }

        databasePassenger.put(11, passenger);
        return true;
    }
}
