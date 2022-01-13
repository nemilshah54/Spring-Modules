package com.nemil.springaop.FlightManagementApp.Aspects;

import com.nemil.springaop.FlightManagementApp.Exceptions.CountryDoesNotExist;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class ExceptionAspect {

    private Logger logger = Logger.getLogger(ExceptionAspect.class.getName());

    @AfterThrowing(pointcut = "execution(* com.nemil.springaop.FlightManagementApp.DAO.PassengerDAOImpl.insert(..))", throwing = "ex")
    public void countryNotExistException(CountryDoesNotExist ex){
        logger.severe("Please Enter a Valid country: " +  ex.getCountryCode());
    }

}
