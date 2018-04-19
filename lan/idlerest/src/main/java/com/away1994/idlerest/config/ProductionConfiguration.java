package com.away1994.idlerest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProductionConfiguration extends BaseConfiguration {

    public String config = "prodTest";

    public ProductionConfiguration() {
        System.out.print("1111");
    }
}
