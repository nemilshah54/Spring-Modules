package com.nemil.springaop.FlightManagementApp.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
@Order(1)
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Before("execution(public String com.nemil.springaop.FlightManagementApp.Flight.getId())")
    public void loggingAdvicegetId(){
        logger.severe("Flight Get ID method will be called.");
    }

    @AfterReturning("execution(public * *.print())")
    public void loggingAdviceprint(){
        logger.info("Critical Information for the Flight Management App will be displayed");
    }

    // Point Cut defined for all the methods of Ticket object.
    @Pointcut("within(com.nemil.springaop.FlightManagementApp.Ticket)")
    public void allTicketMethods(){

    }

    @After("allTicketMethods()")
    public void loggingAdviceticketMethod(JoinPoint joinPoint){
        logger.warning("Ticket Method is called");
        logger.warning(joinPoint.toString());
        logger.warning(joinPoint.getTarget().toString());
    }
}
