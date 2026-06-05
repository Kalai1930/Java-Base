package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.ProductDTO;
import com.example.demo.Services.ProductService;
import com.example.demo.config.JwtUtil;
import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductRepo;

import io.jsonwebtoken.Claims;
import jakarta.validation.Valid;

@RestController
public class ProductController {
	
	
	private final ProductRepo repo;
	
	private final ProductService proser;
	
	@Autowired
	ProductController(ProductRepo repo, JwtUtil jwtUtil, ProductService proser){
		this.repo = repo;
		this.proser = proser;
		
	}
	
	@PostMapping("/addProduct")
	public ResponseEntity<?> addProduct(
	        @RequestHeader("Authorization") String token,
	        @Valid @RequestBody ProductDTO proDTO) throws Exception{
		ResponseEntity<?> response = proser.addProduct(token, proDTO);
		
		return response;
		
	    
	}
	
	//update Product
	@PutMapping("/updateProduct")
	public ResponseEntity<?> updateProduct(@RequestHeader("Authorization") String token,
	        @Valid @RequestBody ProductDTO dto) {
		
		return proser.updateProduct(token, dto);
	
	}
	//get all products
	
	//get a product by Id
	@GetMapping("/getproduct/{id}")
	public ResponseEntity<?> getProductById(@RequestHeader("Authorization") String token, @Valid @PathVariable Integer id){
			
			return proser.getProductById(token, id);
	}
	
	 @DeleteMapping("/deleteProduct/{id}")
	 public ResponseEntity<?> deleteProduct(@Valid @PathVariable Integer id, @RequestHeader("Authorization") String token) {
	
		return proser.deleteProductById(token, id);
	 }

	@GetMapping("/getAllProducts")
	public ResponseEntity<?> get(@RequestHeader("Authorization") String token, @Valid @RequestParam int page, @RequestParam int size) {
	
		return (proser.getAllProducts(token,page,size));
		
	}

}
