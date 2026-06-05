package com.example.demo.Services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.ProductDTO;
import com.example.demo.DTO.UserDTO;
import com.example.demo.config.JwtUtil;
import com.example.demo.entity.ProductEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.ProductRepo;
import com.example.demo.repository.UserRepo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;

@Service
public class ProductService {
	
	
	private final ProductRepo repo;
	
	private final JwtUtil jwtUtil;
	
	private final UserRepo urepo;
	
	private Claims claim;
	
	@Autowired
	public ProductService(ProductRepo repo, JwtUtil jwtUtil,UserRepo urepo) {
		this.repo = repo;
		this.jwtUtil = jwtUtil;
		this.urepo = urepo;
	}
	
	public static ProductEntity convertToEntituy(ProductDTO proDTO) {
		ProductEntity product = new ProductEntity();
		product.setCategory(proDTO.getCategory());
		product.setModel(proDTO.getModel());
		product.setPrice(proDTO.getPrice());
		product.setStock(proDTO.getStock());
		product.setProductName(proDTO.getProductName());
		

		return product;
	}
	
	public static UserDTO convertToUserDTO(UserEntity entity) {
		UserDTO user = new UserDTO();
		user.setMobile(entity.getMobile());
		user.setName(entity.getName());
		user.setRole(entity.getRole());
		user.setUserEmail(entity.getUserEmail());
		
		return user;
	}
	
	
	public ResponseEntity<?> addProduct(String token, ProductDTO proDTO) {
		
		 try {
		        // Remove "Bearer " prefix
				claim = jwtUtil.validateToken(token);
		        
		        Integer userId = claim.get("UserId",Integer.class);
		        
		        
		        if(!(jwtUtil.hasRole(claim, "user") || jwtUtil.hasRole(claim, "distributor"))) {
		        	return ResponseEntity.status(HttpStatus.FORBIDDEN)
                            .body(Map.of("error", "Access denied"));
		        }
		        
		        
		        ProductEntity pEntity = convertToEntituy(proDTO);
		        UserEntity user = urepo.findById(userId).get();
		        pEntity.setUser(user);
		        
		        UserDTO userdto = convertToUserDTO(user);
		        
		        proDTO.setUser(userdto);
		        ProductEntity savedPro = repo.save(pEntity);
		        proDTO.setProductId(savedPro.getProductId());
		        return ResponseEntity.status(HttpStatus.CREATED).body(proDTO);


		    } catch (JwtException e) {
		        // JWT parsing/validation error
		    	e.printStackTrace();
		        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
		                             .body(Map.of("error", "Invalid or expired token"));
		    } catch (Exception e) {
		        e.printStackTrace();
		        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
		                             .body(Map.of("error", "Server error"));
		    }
		}
	

	public ResponseEntity<?> getAllProducts(String token, int page, int size) {
		try {
			jwtUtil.validateToken(token);
			PageRequest pageable = PageRequest.of(page, size);
			Page<ProductEntity> data = repo.findAll(pageable);
			System.out.println(repo.count());
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(data);
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(List.of("error","BAD REQUEST"));
		}	
	}
	
	public ResponseEntity<?> getProductById(String token,Integer id){
		
		 jwtUtil.validateToken(token);
		
		ProductEntity entity = repo.findById(id).orElseThrow(() -> new RuntimeException("ProductId not found"));
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(entity);
		
	}
	
	
		public ResponseEntity<?> deleteProductById(String token, Integer id){
			 claim = jwtUtil.validateToken(token);
			
			Integer cid = claim.get("userId", Integer.class);
			ProductEntity entity = repo.findById(id).orElseThrow(() -> new RuntimeException("Product ID not found"));
			Integer proUserId = entity.getUser().getUserId();
			
			if(!(jwtUtil.hasRole(claim, "user") || jwtUtil.hasRole(claim, "distributor"))) {
	        	return ResponseEntity.status(HttpStatus.FORBIDDEN)
	                    .body(Map.of("error", "Access denied"));
	        }
			else if(!(cid == proUserId)){
				return ResponseEntity.status(HttpStatus.FORBIDDEN)
	                    .body(Map.of("error", "You don't have permission to delete this "+entity.getProductName()));
			}
			else {
				repo.deleteById(id);
				return ResponseEntity.status(HttpStatus.ACCEPTED).body(entity.getProductName()+" deleted successfully");
			}
			
		}
		
		public ResponseEntity<?> updateProduct(String token, ProductDTO dto){
			
			claim = jwtUtil.validateToken(token);
			
			String role = claim.get("role",String.class);
			
			if (!(role.equals("distributor") || role.equals("admin"))) {
	            return ResponseEntity.status(HttpStatus.FORBIDDEN)
	                                 .body(Map.of("error", "Access denied"));
	        }
			
			
	        ProductEntity savedEntity = convertToEntituy(dto);
	        repo.save(savedEntity);
	        return ResponseEntity.status(HttpStatus.CREATED).body(savedEntity);
		}
	}

