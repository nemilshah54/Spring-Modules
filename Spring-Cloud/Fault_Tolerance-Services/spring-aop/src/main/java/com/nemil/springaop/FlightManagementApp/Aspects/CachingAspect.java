package com.nemil.springaop.FlightManagementApp.Aspects;

import com.nemil.springaop.FlightManagementApp.DAO.PassengerDAOImpl;
import com.nemil.springaop.FlightManagementApp.Passenger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(3)
public class CachingAspect {

    @Around("execution(* com.nemil.springaop.FlightManagementApp.DAO.PassengerDAOImpl.getPassenger(..))")
    public Object cachePassenger(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        Object[] methodArgs = proceedingJoinPoint.getArgs();
        Passenger result = (Passenger) proceedingJoinPoint.proceed();

        int id = (Integer) methodArgs[0];
        if (!PassengerDAOImpl.getPassengerMap().containsKey(id)){
            PassengerDAOImpl.getPassengerMap().put(id,result);
        }
        return result;
    }
}
