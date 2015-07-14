package com.krzysztof.restaurant.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.krzysztof.restaurant.helpers.Receipt;

@Entity
public class GroupOrder extends AbstractOrder {

	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.EAGER)
	private Collection<AbstractOrder> collectionOfOrders = new ArrayList<>();

	protected GroupOrder() {
	}

	public GroupOrder(Collection<AbstractOrder> abstractOrders) {
		collectionOfOrders = abstractOrders;

	};

	@Override
	public Receipt fetchReceipt() {
		Receipt receipt = new Receipt();

		for (AbstractOrder order : collectionOfOrders) {
			receipt.addReceipt(order.fetchReceipt());
		}

		setOrderStatus(Status.CHECKOUT);

		return receipt;
	}

	public Collection<AbstractOrder> getCollectionOfOrders() {
		return collectionOfOrders;
	}

	public void setCollectionOfOrders(Collection<AbstractOrder> collectionOfOrders) {
		this.collectionOfOrders = collectionOfOrders;
	}

}
