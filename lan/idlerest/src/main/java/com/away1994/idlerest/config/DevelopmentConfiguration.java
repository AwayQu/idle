package com.away1994.idlerest.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevelopmentConfiguration extends BaseConfiguration {

    public String config = "devTest";

    public DevelopmentConfiguration() {
        System.out.print("2222");
    }
}
