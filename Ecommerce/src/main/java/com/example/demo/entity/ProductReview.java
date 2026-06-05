package com.example.demo.entity;

import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class ProductReview {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer reviewId;
	
	@Min(value=1)
	@Max(value=5)
	private Double rating;
	
	private String comment;
	
	@ManyToOne
	@JoinColumn(name="productId", 
			foreignKey = @ForeignKey(name="FK_PR_proId"))
	private ProductEntity product;
	
	public ProductReview(Integer id, @Min(1) @Max(5) Double rating, String comment, ProductEntity product) {
		super();
		this.reviewId = id;
		this.rating = rating;
		this.comment = comment;
		this.product = product;
	}
	
	public ProductReview() {
		super();
	}

	public Integer getReviewId() {
		return reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}
	
	
	
	
}
