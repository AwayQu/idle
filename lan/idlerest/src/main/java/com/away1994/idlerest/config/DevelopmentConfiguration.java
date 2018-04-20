package com.away1994.idlerest.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevelopmentConfiguration extends BaseConfiguration {

    private String projectPath = "/Users/away/Desktop/projects";
    private String symbolsPath = "/Users/away/Desktop/symbols";


    public DevelopmentConfiguration() {
        System.out.print("2222");
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
