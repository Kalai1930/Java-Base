package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Positive;

@Entity
public class CartItemEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cartId;
	
	 @ManyToOne
	    @JoinColumn(name = "product_id", nullable = false)
	    private ProductEntity product;
	
	
	@Positive(message="number of quatity greater than 0")
	private Integer quantity;
	
	 private Double price;   // unit price at time of order
	

	 @ManyToOne
	  @JoinColumn(name = "orderId", nullable = false)
	 @JsonIgnore
	    private OrderEntity order;   // <-- relationship field
	//private String  name;
	 
	 public CartItemEntity(ProductEntity product, Integer quantity, Double price, OrderEntity order) {
		 super();
	        this.product = product;
	        this.quantity = quantity;
	        this.price = price;
	       
	       this.order = order;
	    }
	 public CartItemEntity() {
		 super();
	 }



	public ProductEntity getProduct() {
		return product;
	}
	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quatity) {
		this.quantity = quatity;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


	 public OrderEntity getOrder() {
			return order;
		}

		 public void setOrder(OrderEntity order) {
			 this.order = order;
		 }
	
}
