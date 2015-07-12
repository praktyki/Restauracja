package com.krzysztof.restaurant.exceptions;

public class OrdersOverflowException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrdersOverflowException(String message){
		super(message);
	}
}
