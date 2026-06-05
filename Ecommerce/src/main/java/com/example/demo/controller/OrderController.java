package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.OrderDTO;
import com.example.demo.Services.OrderService;
import com.example.demo.Services.PaymentService;
import com.example.demo.entity.OrderEntity;
import com.razorpay.Order;

import jakarta.validation.Valid;


@RestController
public class OrderController {
	
	private OrderService orderser;
	
	private PaymentService paySer;

	
	@Autowired
	public OrderController(OrderService orderser,PaymentService paySer)
	{
		this.orderser = orderser;
		this.paySer = paySer;
		
	}
	
	
	
	@PostMapping("/addItem")
	public ResponseEntity<Order> createOrder(@RequestHeader("Authorization") String token,@Valid @RequestBody OrderDTO oderdto) throws Exception{
		
//		/ ResponseEntity<Map<String, Object>>
		Order order = orderser.createOrder(oderdto,token);
		//PaymentEntity payment = paySer.createPayment(order, token);

	   // Map<String, Object> response = new HashMap<>();
	    //response.put("order", order);
	  //  response.put("payment", payment);

	    return ResponseEntity.ok(order);
	}
	
	@GetMapping("/getorderbyref/{refId}")
	public ResponseEntity<OrderEntity> getByRefNo(@PathVariable String refId){
		OrderEntity order = orderser.getOrderByOrderNo(refId);
		
		return ResponseEntity.ok(order);
	}
	
	
	
	
}
	


