package com.example.demo.config;

import java.security.Key;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Configuration
public class JwtConfig {

    @Bean
     Key jwtSigningKey() {
        // Generate or load a secure key
        return Keys.secretKeyFor(SignatureAlgorithm.HS256);
    }
}