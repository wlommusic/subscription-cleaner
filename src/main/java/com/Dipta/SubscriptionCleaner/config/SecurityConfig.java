package com.Dipta.SubscriptionCleaner.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().authenticated() // Require authentication for all endpoints
                )
                .httpBasic(httpBasic -> {}) // Enable Basic Authentication (New way)
                .csrf(csrf -> csrf.disable()) // Disable CSRF for API testing
                .build();
    }
}