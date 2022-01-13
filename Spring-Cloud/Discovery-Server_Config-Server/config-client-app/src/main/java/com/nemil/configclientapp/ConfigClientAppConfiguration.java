package com.nemil.configclientapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "some")
public class ConfigClientAppConfiguration {
    String property;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        System.out.println(property);
        this.property = property;
    }
}
