package com.example.demo.DTO;

public class UserDTO {

	
	private String name;
	private String mobile;
	private String role;
	private String userEmail;
	
	
	
	public UserDTO(String name, String mobile, String userEmail) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.userEmail = userEmail;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDTO(String name, String mobile, String role, String userEmail) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.role = role;
		this.userEmail = userEmail;
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
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
}
