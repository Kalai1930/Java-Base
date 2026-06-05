package com.example.demo.Services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.CartItemDTO;
import com.example.demo.DTO.OrderDTO;
import com.example.demo.config.JwtUtil;
import com.example.demo.entity.CartItemEntity;
import com.example.demo.entity.OrderEntity;
import com.example.demo.entity.OrderStatus;
import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.OrderRepo;
import com.example.demo.repository.ProductRepo;
import com.example.demo.repository.UserRepo;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

import io.jsonwebtoken.Claims;
import jakarta.annotation.PostConstruct;

@Service
public class OrderService {
	
	@Autowired
	private ProductRepo pRepo;
	private OrderRepo oRepo;
	private JwtUtil jwtUtil;
	private UserRepo uRepo;
	
	private RazorpayClient client;

    @Value("${razorpay.key.id}")
    private String razorPayKey;

    @Value("${razorpay.secret.key}")
    private String razorPaySecret;
	
	public OrderService(ProductRepo pRepo,OrderRepo oRepo,JwtUtil jwtUtil,UserRepo uRepo) {
		this.oRepo = oRepo;
		this.pRepo = pRepo;
		this.jwtUtil = jwtUtil;
		this.uRepo = uRepo;
	}
	
	@PostConstruct
    public void initClient() throws Exception {
        this.client = new RazorpayClient(razorPayKey, razorPaySecret);
    }
	
	public Order createOrder(OrderDTO orderdto, String token) throws RazorpayException {
		Claims claim = jwtUtil.validateToken(token);
		Integer userId = claim.get("UserId",Integer.class);
		String email = claim.getSubject();
		OrderEntity order = new OrderEntity();
		//UserEntity user = new UserEntity(.getName(), uRepo.findById(userId).get().getUserEmail());
		order.setUser(uRepo.findById(userId).get());
		order.setOrder_status(OrderStatus.INPROGRESS);
		Double totalprice = 0.0;
		for(CartItemDTO item: orderdto.getCartItemsDto()) {
			CartItemEntity cartItem = new CartItemEntity();
			cartItem.setPrice(item.getPrice());
//			
				ProductEntity product = pRepo.findById(item.getProductId())
											.orElseThrow(() -> new RuntimeException("Product not found"));
				cartItem.setProduct(product);
				cartItem.setPrice(item.getPrice());
				cartItem.setQuantity(item.getQuantity());
				totalprice += item.getQuantity()*item.getPrice();
				
				cartItem.setOrder(order);
				order.getItems().add(cartItem);
				
				}
		order.setAmount(totalprice);
		JSONObject orderReq = new JSONObject();
        orderReq.put("amount", totalprice* 100); // in paisa
        orderReq.put("currency", "INR");
        orderReq.put("receipt", email);

        Order razorPayOrder = client.orders.create(orderReq);
       
		order.setOrder_date(LocalDateTime.now());
		order.setOrderNo(razorPayOrder.get("id"));
		oRepo.save(order);
		return razorPayOrder;
				
	}
	
	
	

    public List<OrderEntity> getAllOrders() {
        return oRepo.findAll();
    }

    public List<OrderEntity> getOrdersByUser(Integer userId) {
        return oRepo.findByUser_UserId(userId);
    }

    public OrderEntity getOrderByOrderNo(String refId) {
        return oRepo.findByOrderNo(refId)
                        .orElseThrow(() -> new RuntimeException("Order not found for Order "));
    }

    public void deleteOrder(Integer id) {
        oRepo.deleteById(id);
    }

}
