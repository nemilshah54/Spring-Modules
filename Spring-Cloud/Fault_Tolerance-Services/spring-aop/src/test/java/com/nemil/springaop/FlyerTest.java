package com.nemil.springaop;

import com.nemil.springaop.FlightManagementApp.Flight;
import com.nemil.springaop.FlightManagementApp.Flyer.FlyerAdvisor;
import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlyerTest {

    @Test
    public void flyerTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                                                ("aop-introduction.xml");

        // Target Object
        Flight flight = (Flight) context.getBean("flight");

        // Advisor Object ( Gives advices (add new features) to target object)
        FlyerAdvisor flyerAdvisor = new FlyerAdvisor();

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(flight);
        proxyFactory.addAdvisor(flyerAdvisor);
        proxyFactory.setOptimize(true);

        // Advised Object ( Target object with new features : Target + Advisor)
      //  Flight proxyFlight = (Flight) proxyFactory.getProxy();

        // Testing Mixing types.

     //   assertTrue(proxyFlight instanceof Flight);

        context.close();
    }
}
