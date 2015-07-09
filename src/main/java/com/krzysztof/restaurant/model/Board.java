package com.krzysztof.restaurant.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public class Board extends AbstractEntity{
	
	public static final long MAX_CAPACITY = 8;
	
	private Collection<Order> ordersCollection;
	
	
}
