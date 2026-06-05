package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Orders")
public class OrderEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer orderId;
		
		@ManyToOne
		@JoinColumn(
				name = "user_id",
		        referencedColumnName = "UserId",
		        nullable = false,
		        foreignKey = @ForeignKey(name="FK_orders_user")
		    )
		@JsonIgnore
		    private UserEntity user;
		
		private String orderNo;
		

		private LocalDateTime order_date;
		
		private Double Amount;
		
		@OneToMany(mappedBy="order",cascade=CascadeType.ALL, orphanRemoval = true)
		private List<CartItemEntity> items=new ArrayList<>();
		
	    private LocalDateTime deliveryDate;

	    private LocalDateTime updatedAt;
	    
	    @Enumerated(EnumType.STRING)
	    private OrderStatus order_status;

		public Integer getOrderId() {
			return orderId;
		}

		public void setOrderId(Integer orderId) {
			this.orderId = orderId;
		}

		public UserEntity getUser() {
			return user;
		}

		public void setUser(UserEntity user) {
			this.user = user;
		}

		public LocalDateTime getOrder_date() {
			return order_date;
		}

		public void setOrder_date(LocalDateTime order_date) {
			this.order_date = order_date;
		}

		public Double getAmount() {
			return Amount;
		}

		public void setAmount(Double amount) {
			Amount = amount;
		}

		public List<CartItemEntity> getItems() {
			return items;
		}

		public void setItems(List<CartItemEntity> items) {
			this.items = items;
		}

		public LocalDateTime getDeliveryDate() {
			return deliveryDate;
		}

		public void setDeliveryDate(LocalDateTime deliveryDate) {
			this.deliveryDate = deliveryDate;
		}


		public LocalDateTime getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(LocalDateTime updatedAt) {
			this.updatedAt = updatedAt;
		}

		public OrderStatus getOrder_status() {
			return order_status;
		}

		public void setOrder_status(OrderStatus order_status) {
			this.order_status = order_status;
		}
		
		public String getOrderNo() {
			return orderNo;
		}

		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}

}