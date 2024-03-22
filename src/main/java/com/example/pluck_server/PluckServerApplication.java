package com.example.pluck_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class PluckServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PluckServerApplication.class, args);
    }

}
