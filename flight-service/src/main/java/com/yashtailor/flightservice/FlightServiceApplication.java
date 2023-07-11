package com.yashtailor.flightservice;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.transaction.annotation.*;

@SpringBootApplication
@EnableTransactionManagement
public class FlightServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlightServiceApplication.class, args);
    }

}
