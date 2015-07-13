package com.krzysztof.restaurant.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.krzysztof.restaurant.helpers.Receipt;

@Entity
public class SingleOrder extends AbstractOrder {

	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.EAGER)
	private Collection<MenuPosition> collectionOfMenuPositions = new ArrayList<>();

	public Collection<MenuPosition> getCollectionOfMenuPositions() {
		return collectionOfMenuPositions;
	}

	@Override
	public Receipt getReceipt() {
		setOrderStatus(Status.CHECKOUT);
		return new Receipt(collectionOfMenuPositions);
	}

	public void setCollectionOfMenuPositions(
			Collection<MenuPosition> collectionOfMenuPositions) {
		this.collectionOfMenuPositions = collectionOfMenuPositions;
	}

}
