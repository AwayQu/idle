package com.away1994.idlerest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProductionConfiguration extends BaseConfiguration {

    private String projectPath = "/www/tmp/projects";
    private String symbolsPath = "/www/tmp/symbols";

    public ProductionConfiguration() {
        System.out.print("1111");
    }

    @Override
    public String getProjectPath() {
        return projectPath;
    }

    @Override
    public String getSymbolsPath() {
        return symbolsPath;
    }
}
