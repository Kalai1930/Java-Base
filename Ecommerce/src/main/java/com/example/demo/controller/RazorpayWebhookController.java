package com.example.demo.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.PaymentService;
import com.example.demo.entity.OrderEntity;
import com.example.demo.entity.OrderStatus;
import com.example.demo.entity.PaymentStatus;
import com.example.demo.repository.OrderRepo;
import com.razorpay.Utils;

@RestController
@RequestMapping("/payments")
public class RazorpayWebhookController {

    private final PaymentService paymentService;
    private final OrderRepo orderRepo;

    @Value("${razorpay.webhook.secret}")
    private String webhookSecret;
    

    @Autowired
    public RazorpayWebhookController(PaymentService paymentService, OrderRepo orderRepo) {
        this.paymentService = paymentService;
        this.orderRepo = orderRepo;
    }

    @PostMapping("/webhook")
    public ResponseEntity<String> handleWebhook(@RequestBody String payload){
                                              // @RequestHeader("X-Razorpay-Signature") String signature) {
        try {
         /*   boolean isValid = Utils.verifyWebhookSignature(payload, signature, webhookSecret);
			
			  if (!isValid) { return
			  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid signature"); }*/
			 
            JSONObject json = new JSONObject(payload);
           // String event = json.getString("event");
            JSONObject paymentObj = json.getJSONObject("payload").getJSONObject("order").getJSONObject("entity");

            String transactionId = paymentObj.getString("id");
            String status = paymentObj.getString("status");

            if ("created".equals(status)) {
                paymentService.updatePayment(transactionId, PaymentStatus.SUCCESS);
                OrderEntity order = paymentService.updatePayment(transactionId, PaymentStatus.SUCCESS).getOrder();
                
                order.setOrder_status(OrderStatus.PAID);
                orderRepo.save(order);
            } else if ("failed".equals(status)) {
                paymentService.updatePayment(transactionId, PaymentStatus.FAILED);
            }

            return ResponseEntity.ok("Webhook processed");
        } catch (Exception e) {
        	e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }
}
