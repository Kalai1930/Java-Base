package com.example.demo.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Payment")
public class PaymentEntity {

	    @Id
	    @GeneratedValue
	    private Integer id;
	    
	    @ManyToOne
		@JoinColumn(
				name = "order_id",
		        referencedColumnName = "orderId",
		        nullable = false,
		        foreignKey = @ForeignKey(name="FK_payment_order")
		    )
	    @JsonIgnore
	    private OrderEntity order;
	    
	    @ManyToOne
		@JoinColumn(
				name = "user_id",
		        referencedColumnName = "UserId",
		        nullable = false,
		        foreignKey = @ForeignKey(name="FK_payment_user")
		    )
	    @JsonIgnore
	    private UserEntity user;
		
	    private Double amount;
	   
	    private String paymentMethod;
	    
		private String provider;

		@Enumerated(EnumType.STRING)
	    private PaymentStatus status; // PENDING, SUCCESS, FAILED, REFUNDED

	    private String failureReason;
	    private Double refundAmount;

	    private LocalDateTime payment_date;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public OrderEntity getOrderId() {
			return order;
		}

		public void setOrder(OrderEntity order) {
			this.order = order;
		}

		public UserEntity getUser() {
			return user;
		}

		public void setUserId(UserEntity user) {
			this.user = user;
		}

		public Double getAmount() {
			return amount;
		}

		public void setAmount(Double amount) {
			this.amount = amount;
		}

		

		public String getPaymentMethod() {
			return paymentMethod;
		}

		public void setPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
		}

		public String getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
		}

		public String getProvider() {
			return provider;
		}

		public void setProvider(String provider) {
			this.provider = provider;
		}

		public String getFailureReason() {
			return failureReason;
		}

		public void setFailureReason(String failureReason) {
			this.failureReason = failureReason;
		}

		public Double getRefundAmount() {
			return refundAmount;
		}

		public void setRefundAmount(Double refundAmount) {
			this.refundAmount = refundAmount;
		}

		public LocalDateTime getPayment_date() {
			return payment_date;
		}

		public void setPayment_date(LocalDateTime payment_date) {
			this.payment_date = payment_date;
		}
	    
		private String transactionId;
	    public PaymentStatus getStatus() {
			return status;
		}

		public void setStatus(PaymentStatus status) {
			this.status = status;
		}

		public OrderEntity getOrder() {
			return order;
		}

		public void setUser(UserEntity user) {
			this.user = user;
		}

	    
}
