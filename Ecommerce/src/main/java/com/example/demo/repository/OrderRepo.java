package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.OrderEntity;

@Repository
public interface OrderRepo extends JpaRepository<OrderEntity, Integer>{

	public List<OrderEntity> findByUser_UserId(Integer UserId);
	public Optional<OrderEntity> findById(Integer orderId);
	
	Optional<OrderEntity> findByOrderNo(String orderNo);
}