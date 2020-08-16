package com.pulawskk.dbsfoodfailover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
public class DbsFoodFailoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbsFoodFailoverApplication.class, args);
    }

}
