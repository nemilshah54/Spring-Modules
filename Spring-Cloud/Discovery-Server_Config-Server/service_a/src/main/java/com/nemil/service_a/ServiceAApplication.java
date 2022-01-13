package com.nemil.service_a;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServiceAApplication {

    @Value("${service_a.instance.name}")
    private String instance;

    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }

    @RequestMapping("/")
    public String getMessage(){
        return "App is " + instance;
    }
}
