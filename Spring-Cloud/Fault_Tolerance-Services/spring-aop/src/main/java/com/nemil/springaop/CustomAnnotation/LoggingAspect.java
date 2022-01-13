package com.nemil.springaop.CustomAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(com.nemil.springaop.CustomAnnotation.Log)")
    public Object log(ProceedingJoinPoint thisJoinPoint) throws Throwable {
        String methodName = thisJoinPoint.getSignature().getName();
        Object[] methodArguments = thisJoinPoint.getArgs();
        logger.info("Method Name: " + methodName + " Method Arguments: " + methodArguments[0]);
        Object result = thisJoinPoint.proceed();
        logger.info("Method: "+ methodName + " returns: "+ result);
        return result;
    }
}
