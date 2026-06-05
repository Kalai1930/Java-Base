package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name="Products")
public class ProductEntity {
	
	@Id
	@GeneratedValue
	private Integer productId;
	
	@NotBlank(message ="product name required")
	private String productName;
	
	@NotBlank(message = "Category required")
	private String category;
	
	@NotBlank(message = "Model required")
	private String model;
	
	@ManyToOne
	@JoinColumn(
			name = "user_id",
	        referencedColumnName = "UserId",
	        nullable = false,
	        foreignKey = @ForeignKey(name="FK_product_user")
			)
	private UserEntity user;

			
	@Positive(message = "Price must be greater than 0")
	private Double price;
	
	private Integer discount;
	
	@Positive(message = "stock count must be greater than 0")
	private Integer stock;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	
	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
