package com.nemil.springaop.FlightManagementApp.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
@Order(2)
public class LoggingAspect2 {

    private Logger logger = Logger.getLogger(LoggingAspect2.class.getName());

//    @Pointcut("execution(* com.nemil.springaop.FlightManagementApp.*.*set*(..))")
//    public void allSetMethods(){
//
//    }
//    @Around("allSetMethods()")
//    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        String methodName = proceedingJoinPoint.getSignature().getName();
//        Object[] methodArguments = proceedingJoinPoint.getArgs();
//        Object result = proceedingJoinPoint.proceed();
//
//        logger.severe("Set Method called: "+ methodName);
//        logger.severe(("Set Method contains arguments: "+ methodArguments[0]));
//        logger.severe("Set Method has result: "+ result);
//
//        return result;
//    }
}
