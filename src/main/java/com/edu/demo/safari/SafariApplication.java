package com.edu.demo.safari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SafariApplication {

    public static void main(String[] args) {
        SpringApplication.run(SafariApplication.class, args);
    }

}
