package com.nemil.configclientapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RefreshScope
public class ConfigClientAppApplication {

    @Autowired
    private ConfigClientAppConfiguration properties;

//    @Value("${some.property}")
//    private String property;

    @Value("${some.other.property}")
    private String someOtherproperty;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientAppApplication.class, args);
    }

    // String that has 'configuration properties value' which was retrived from 'Config server'
    @RequestMapping
    public String printConfigProperties(){
        StringBuilder stringBuilder = new StringBuilder();
        //stringBuilder.append(property);
        stringBuilder.append(properties.getProperty());
        stringBuilder.append(("||"));
        stringBuilder.append(someOtherproperty);

        return stringBuilder.toString();
    }

}
