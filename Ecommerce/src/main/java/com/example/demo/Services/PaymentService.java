package com.example.demo.Services;

import java.time.LocalDateTime;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.config.JwtUtil;
import com.example.demo.entity.OrderEntity;
import com.example.demo.entity.PaymentEntity;
import com.example.demo.entity.PaymentStatus;
import com.example.demo.repository.PaymentRepo;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;

import io.jsonwebtoken.Claims;
import jakarta.annotation.PostConstruct;

@Service
public class PaymentService {

    private final PaymentRepo paymentRepo;
    private final JwtUtil jwtUtil;
    

    @Autowired
    public PaymentService(PaymentRepo paymentRepo, JwtUtil jwtUtil) {
        this.paymentRepo = paymentRepo;
        this.jwtUtil = jwtUtil;
    }

    

    public PaymentEntity createPayment(OrderEntity order, String token) throws Exception {
        Claims claim = jwtUtil.validateToken(token);
        String email = claim.getSubject();

        
        PaymentEntity payment = new PaymentEntity();
        payment.setOrder(order);
        payment.setUser(order.getUser());
        payment.setAmount(order.getAmount());
        payment.setProvider("Razorpay");
       // payment.setTransactionId();
        payment.setStatus(PaymentStatus.PENDING);
        payment.setPayment_date(LocalDateTime.now());

        return paymentRepo.save(payment);
    }

    public PaymentEntity updatePayment(String transactionId, PaymentStatus status) {
        PaymentEntity payment = paymentRepo.findByTransactionId(transactionId)
                .orElseThrow(() -> new RuntimeException("Payment not found"));
        payment.setStatus(status);
        return paymentRepo.save(payment);
    }
}
