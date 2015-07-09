package com.krzysztof.restaurant.model;

public abstract class Entity {
	private long orderId;
	
	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
}
