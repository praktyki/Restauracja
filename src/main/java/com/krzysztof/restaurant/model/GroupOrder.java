package com.krzysztof.restaurant.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Inheritance;


@Entity
@Inheritance
public class GroupOrder extends Order{

	private Collection<Order> collectionOfOrders = new ArrayList<>();
	
	public Collection<Order> getCollectionOfOrders() {
		return collectionOfOrders;
	}

	public void setCollectionOfOrders(Collection<Order> collectionOfOrders) {
		this.collectionOfOrders = collectionOfOrders;
	}

	@Override
	public BigDecimal getCost() {
		BigDecimal orderCost = new BigDecimal(0);
		
		for(Order order : collectionOfOrders){
			orderCost = orderCost.add(order.getCost());
		}
		
		return orderCost;
	}

}
