package com.iamneo.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.iamneo.security.config.CorsConfig; // Import the CorsConfig class

@SpringBootApplication
@Import(CorsConfig.class) // Import the CorsConfig class to enable CORS
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }

}