package com.example.demo.config;

import java.security.Key;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Configuration
public class EcommerceConfig {
	
	@Bean
	SecurityFilterChain security(HttpSecurity http) {
		try {
			http.csrf(csrf -> csrf.disable())
			.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
			return http.build();
		}
		catch(Exception e) {
			System.out.println("Security configuration error");
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	

	/*
	 * @Bean Key jwtSigningKey() { // Generate a secure key once return
	 * Keys.secretKeyFor(SignatureAlgorithm.HS256); }
	 * 
	 */
}
