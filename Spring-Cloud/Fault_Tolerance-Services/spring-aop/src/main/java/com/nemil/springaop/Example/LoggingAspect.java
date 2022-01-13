package com.nemil.springaop.Example;

import java.util.logging.Logger;

public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    public void before(){
        logger.info("Entering Method");
    }

    public void after(){
        logger.info("Exiting Method");
    }
}
