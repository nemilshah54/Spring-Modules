package com.nemil.springaop.FlightManagementApp;

import com.nemil.springaop.FlightManagementApp.Flyer.Flyer;
import com.nemil.springaop.FlightManagementApp.Flyer.FlyerAdvisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FlyerTest {

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
         Flight proxyFlight = (Flight) proxyFactory.getProxy();

        // Testing Mixing types.
        if(proxyFlight instanceof Flight){
            System.out.println("Test 1 passed");
            System.out.println("Flight Name: "+ proxyFlight.getCompany());
        }

        if(proxyFlight instanceof Flyer){
            System.out.println("Test 2 passed");
            ((Flyer) proxyFlight).takeOff();
            ((Flyer) proxyFlight).fly();
            ((Flyer) proxyFlight).land();
        }

        System.out.println("Name of Flight class: " + proxyFlight.getClass().getName());

        //   assertTrue(proxyFlight instanceof Flight);

        context.close();
    }
}
