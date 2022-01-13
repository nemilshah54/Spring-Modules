package com.nemil.springaop.FlightManagementApp.Flyer;

import org.springframework.aop.support.DefaultIntroductionAdvisor;

// Programmic Approach Only.
public class FlyerAdvisor extends DefaultIntroductionAdvisor {

    public FlyerAdvisor() {
        super (new FlyerImpl());
    }
}
