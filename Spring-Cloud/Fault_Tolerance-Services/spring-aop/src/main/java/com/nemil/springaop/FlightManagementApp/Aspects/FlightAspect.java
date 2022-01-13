package com.nemil.springaop.FlightManagementApp.Aspects;

import com.nemil.springaop.FlightManagementApp.Flyer.Flyer;
import com.nemil.springaop.FlightManagementApp.Flyer.FlyerDeclarativeImpl;
import com.nemil.springaop.FlightManagementApp.Flyer.FlyerImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class FlightAspect {

    @DeclareParents(
            value = "com.nemil.springaop.FlightManagementApp.Flight",
            defaultImpl = FlyerDeclarativeImpl.class
    )
    private Flyer flyer;
}
