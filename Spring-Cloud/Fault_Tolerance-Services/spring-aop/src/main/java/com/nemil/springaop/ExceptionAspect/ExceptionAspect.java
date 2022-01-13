package com.nemil.springaop.ExceptionAspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class ExceptionAspect {

  private Logger logger = Logger.getLogger(ExceptionAspect.class.getName());

  @AfterThrowing(pointcut = "execution(* *(..))", throwing = "exception")
  public void processException(RuntimeException exception){
      logger.severe("Exception: "+ exception.getMessage());
  }
}
