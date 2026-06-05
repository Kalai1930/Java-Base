package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="Users")
public class UserEntity {
	
	@Id
	@GeneratedValue
	private Integer UserId;
	
	@NotBlank(message = "Required User name")
	private String name;
	
	@NotBlank(message = "mobile required")
	private String mobile;

	@NotBlank(message = "Role required")
	private String role;
	
	@Email(message = "email required")
	@Column(unique=true)
	private String userEmail;
	
	@NotBlank(message = "Password required")
	private String password;

	public Integer getUserId() {
		return UserId;
	}

	public void setUserId(Integer userId) {
		UserId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUsername_email(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
