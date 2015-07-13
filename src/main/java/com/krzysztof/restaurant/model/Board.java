package com.krzysztof.restaurant.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Board extends AbstractEntity {

	private int capacity;

	@OneToMany(cascade = javax.persistence.CascadeType.MERGE)
	private Collection<AbstractOrder> ordersCollection;

	public int getCapacity() {
		return capacity;
	}

	public Collection<AbstractOrder> getOrdersCollection() {
		return ordersCollection;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setOrdersCollection(Collection<AbstractOrder> ordersCollection) {
		this.ordersCollection = ordersCollection;
	}

}
