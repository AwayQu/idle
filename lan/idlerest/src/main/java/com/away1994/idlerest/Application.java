package com.away1994.idlerest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        /**
         * ref: https://spring.io/guides/gs/rest-service-cors/
         */
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/github").allowedOrigins("http://localhost:3000", "http://127.0.0.1:3000");
                registry.addMapping("/github").allowCredentials(true); // cookie upload permission
                registry.addMapping("/github/project").allowedOrigins("http://localhost:3000", "http://127.0.0.1:3000");
                registry.addMapping("/github/project").allowCredentials(true); // cookie upload permission
            }
        };
    }
}
