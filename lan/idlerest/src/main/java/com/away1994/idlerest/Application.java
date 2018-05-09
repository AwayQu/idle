package com.away1994.idlerest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
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
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add("/github");
                arrayList.add("/github/diagram/files");
                arrayList.add("/github/fileTree");
                arrayList.add("/github/project");

                for (String url : arrayList) {
                    registry.addMapping(url).allowedOrigins("http://localhost:3000", "http://127.0.0.1:3000");
                    registry.addMapping(url).allowCredentials(true); // cookie upload permission
                }
            }
        };
    }
}


//@SpringBootApplication
//public class Application {
//
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
//
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        /**
//         * ref: https://spring.io/guides/gs/rest-service-cors/
//         */
//        return new WebMvcConfigurerAdapter() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                ArrayList<String> arrayList = new ArrayList<>();
//                arrayList.add("/github");
//                arrayList.add("/github/diagram/files");
//                arrayList.add("/github/fileTree");
//                arrayList.add("/github/project");
//
//                for (String url : arrayList) {
//                    registry.addMapping(url).allowedOrigins("http://localhost:3000", "http://127.0.0.1:3000");
//                    registry.addMapping(url).allowCredentials(true); // cookie upload permission
//                }
//            }
//        };
//    }
//}
