package com.nemil.weatherapp;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Autowired
    private RestTemplate restTemplate;

    // Protected Call - Fault tolerance. (Circuit breaker pattern - Strategy)
    @HystrixCommand(fallbackMethod = "fallBackMethod")
    public String getCurrentWeather(){
        return "Current weather: " + restTemplate.getForEntity("http://weather-service", String.class).getBody();
    }

    // Method executed when there is fault in above method.
    public String fallBackMethod() {
        return "Weather Service is under maintenance: Calling Fall back Method (Fault tolerance)";
    }

}
