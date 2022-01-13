package com.nemil.gatewayservice;

import com.nemil.filters.AddRequestHeaderFilter;
import com.netflix.zuul.ZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public AddRequestHeaderFilter addRequestHeaderFilter(){
        return new AddRequestHeaderFilter();
    }
}
