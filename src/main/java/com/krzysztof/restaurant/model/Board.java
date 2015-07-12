package com.krzysztof.restaurant.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.krzysztof.restaurant.exceptions.OrdersOverflowException;

@Entity
public class Board extends AbstractEntity{
	
	private int capacity = 8;
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@OneToMany
	private Collection<AbstractOrder> ordersCollection;

	public Collection<AbstractOrder> getOrdersCollection() {
		return ordersCollection;
	}

	public void setOrdersCollection(Collection<AbstractOrder> ordersCollection) {
		this.ordersCollection = ordersCollection;
	}
	
	public void addOder(AbstractOrder orderToAdd) throws OrdersOverflowException {
		if(ordersCollection.size() == capacity) {
			throw new OrdersOverflowException("Board is full");
		} else {
			ordersCollection.add(orderToAdd);
		}
	}
	
	
}
