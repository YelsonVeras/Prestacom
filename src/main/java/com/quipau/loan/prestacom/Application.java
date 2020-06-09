package com.quipau.loan.prestacom;

import com.quipau.loan.prestacom.utils.bootstrap.BootStrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application extends ServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    BootStrap initialize() {
        return new BootStrap();
    }
}
