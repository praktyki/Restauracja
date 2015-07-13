package com.krzysztof.restaurant.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.krzysztof.restaurant.helpers.Receipt;

@Entity
public class SingleOrder extends AbstractOrder {

	@OneToMany
	private Collection<MenuPosition> collectionOfMenuPositions = new ArrayList<>();

	public Collection<MenuPosition> getCollectionOfMenuPositions() {
		return collectionOfMenuPositions;
	}

	public void setCollectionOfMenuPositions(Collection<MenuPosition> collectionOfMenuPositions) {
		this.collectionOfMenuPositions = collectionOfMenuPositions;
	}


	@Override
	public Receipt getReceipt() {
		return new Receipt(collectionOfMenuPositions);
	}

}
