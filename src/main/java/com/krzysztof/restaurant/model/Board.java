package com.krzysztof.restaurant.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Board extends AbstractEntity {

	private int capacity;

	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	private Collection<AbstractOrder> ordersCollection;

	@Version
	private int version;

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
