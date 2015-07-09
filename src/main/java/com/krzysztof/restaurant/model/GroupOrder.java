package com.krzysztof.restaurant.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GroupOrder extends Order{

	private List<Order> listOfOrders = new ArrayList<>();
	
	public List<Order> getListOfOrders() {
		return listOfOrders;
	}

	public void setListOfOrders(List<Order> listOfOrders) {
		this.listOfOrders = listOfOrders;
	}

	@Override
	public BigDecimal getCost() {
		BigDecimal orderCost = new BigDecimal(0);
		
		for(Order order : listOfOrders){
			orderCost = orderCost.add(order.getCost());
		}
		
		return orderCost;
	}

}
