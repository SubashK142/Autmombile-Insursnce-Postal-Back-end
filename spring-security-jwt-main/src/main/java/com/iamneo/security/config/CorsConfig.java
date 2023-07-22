package com.iamneo.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/v1/auth")
                .allowedOrigins("http://localhost:3000") // Allow requests from this origin (your ReactJS frontend)
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow these HTTP methods
                .allowCredentials(true); // Allow credentials (e.g., cookies) to be included in the request
                // Set the max age of the CORS preflight response in seconds
    }
}