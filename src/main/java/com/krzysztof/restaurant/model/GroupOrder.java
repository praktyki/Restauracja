package com.krzysztof.restaurant.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.krzysztof.restaurant.helpers.Receipt;

@Entity
public class GroupOrder extends AbstractOrder {

	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	private Collection<AbstractOrder> collectionOfOrders = new ArrayList<>();

	public Collection<AbstractOrder> getCollectionOfOrders() {
		return collectionOfOrders;
	}

	@Override
	public Receipt getReceipt() {
		Receipt receipt = new Receipt();

		for (AbstractOrder order : collectionOfOrders) {
			receipt.addReceipt(order.getReceipt());
		}

		return receipt;
	}

	public void setCollectionOfOrders(Collection<AbstractOrder> collectionOfOrders) {
		this.collectionOfOrders = collectionOfOrders;
	}

}
