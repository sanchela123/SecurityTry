package com.example.securitytry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@SpringBootApplication
@EntityScan("com.example.securitytry.entity")
public class SecurityTryApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SecurityTryApplication.class, args);
    }


}
