package com.example.study5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Study5Application {

    public static void main(String[] args) {
        SpringApplication.run(Study5Application.class, args);
    }

}
