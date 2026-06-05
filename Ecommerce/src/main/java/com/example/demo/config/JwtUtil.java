package com.example.demo.config;

import java.security.Key;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;

@Component
public class JwtUtil {

    @Autowired
    private Key key;

    public Claims validateToken(String token) throws JwtException {
    	
        token = token.substring(7); // remove "Bearer "
        Claims claim = Jwts.parserBuilder()
        		  .setSigningKey(key) 
        		  .build() 
        		  .parseClaimsJws(token) 
        		  .getBody();
        return claim;
    }

    public boolean hasRole(Claims claims, String... roles) {
        String role = claims.get("role", String.class);
        return Arrays.asList(roles).contains(role);
    }
}