package com.example.demo.DTO;

import java.util.List;

public class OrderDTO {
	
	private List<CartItemDTO> cartItemsDto;

	public List<CartItemDTO> getCartItemsDto() {
		return cartItemsDto;
	}

	public void setCartItemsDto(List<CartItemDTO> cartItemsDto) {
		this.cartItemsDto = cartItemsDto;
	}

}
