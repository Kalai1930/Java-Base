package com.example.demo.controller;

import java.security.Key;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.JwtUtil;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import jakarta.validation.Valid;

@RestController
public class UserController {

	private final JwtUtil jwtUtil;
	@Autowired
	public UserRepo repo;
	public Key key;
	
	UserController(UserRepo repo, Key key, JwtUtil jwtUtil){
		this.repo = repo;
		this.key = key;
		this.jwtUtil = jwtUtil;
	}
    
	
	@PostMapping("/register")
	public String register(@Valid @RequestBody UserEntity secure) {
		try {
			if(repo.findByUserEmail(secure.getUserEmail()).isPresent()) {
				return "user already exist";
			}
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			secure.setPassword(encoder.encode(secure.getPassword()));
			repo.save(secure);
			return "User successfully registered";
		}
		catch(Exception e) {
			return "error ouccured";
		}
	}
	
	@PostMapping("/login")
	public String login(@RequestBody UserEntity secure) {
		String email = secure.getUserEmail();
		String password = secure.getPassword();
		try {
			UserEntity sample = repo.findByUserEmail(email).orElse(null);
			if(sample == null) {
				return "user not found";
			}
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			boolean check = encoder.matches(password,sample.getPassword());
			if(!check) {
				return "invalid password";
			}
			
			String token = Jwts.builder()
					.setSubject(sample.getUserEmail())
					.claim("role", sample.getRole())
					.claim("UserId", sample.getUserId())
					.setIssuedAt(new Date())
					.setExpiration(new Date(System.currentTimeMillis()+ 1000 * 60 * 60))
					.signWith(key).compact();
				 return token;
			
			//return "login successfully";
		}
		catch(Exception e) {
			return "invalid";
		}
		
	}
	
	
	
	@GetMapping("/getUser")
	public ResponseEntity<?> getDetails(@Valid @RequestHeader("Authorization")String token) {
		try {

			Claims claim;
			
				claim = jwtUtil.validateToken(token);
			
			String email = claim.getSubject();
			if(jwtUtil.hasRole(claim, "user") || jwtUtil.hasRole(claim, "distributor")) {
				return ResponseEntity.ok().body(repo.findByUserEmail(email));
			}
			else if(jwtUtil.hasRole(claim, "admin")) {
				return ResponseEntity.ok().body(repo.findAll());
			}
			else
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body(Map.of("error","ACCESS DENIED"));
			
		} 
		catch (JwtException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("error", "Invalid or expired token"));
		}
	}
	
	/*
	 * @GetMapping("/getUser") public Object
	 * getData(@Valid @RequestHeader("Authorization")String token) {
	 * 
	 * token = token.substring(7); Claims claim = Jwts.parserBuilder()
	 * .setSigningKey(key) .build() .parseClaimsJws(token) .getBody(); String role =
	 * claim.get("role").toString(); String email = claim.getSubject();
	 * 
	 * UserEntity user = repo.findByUserEmail(email).orElse(null);
	 * 
	 * if(!(role).equals("user")) { return "access denied"; } else return user; }
	 */
}
