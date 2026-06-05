package com.example.demo.DTO;

public class CartItemDTO {

	private Integer productId;

	private Integer quantity;
	
	 private Double price;   // unit price at time of order
	
	 	
	 public CartItemDTO(Integer productId, Integer quantity, Double price) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
		
	}
	 public CartItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	 public Integer getProductId() {
		 return productId;
	 }
	 public void setProductId(Integer productId) {
		 this.productId = productId;
	 }
	 public Integer getQuantity() {
		 return quantity;
	 }
	 public void setQuantity(Integer quantity) {
		 this.quantity = quantity;
	 }
	 public Double getPrice() {
		 return price;
	 }
	 public void setPrice(Double price) {
		 this.price = price;
	 }
	 
}
