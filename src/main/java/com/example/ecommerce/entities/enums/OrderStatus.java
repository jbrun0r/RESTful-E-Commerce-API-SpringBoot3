package com.example.ecommerce.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int orderStatusCode;
	
	private OrderStatus(int orderStatusCode) {
		this.orderStatusCode = orderStatusCode;
	}
	
	public int getStatusCode() {
		return orderStatusCode;
	}
	
	public static OrderStatus valueOf(int orderStatusCode) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getStatusCode() == orderStatusCode) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid orderStatusCode");
	}
}
