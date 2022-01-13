package com.nemil.springaop.Example2;

import com.nemil.springaop.SpringAopApplication;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Before("execution(* *.*PassengerById(..))")
    public void before(){

        logger.info("Entering Method "  + PassengerService.x );
    }
    @After("execution(* *.*PassengerById(..))")
    public void after(){
        logger.info("Exiting Method " + PassengerService.x);
    }
}
