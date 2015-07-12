package com.krzysztof.restaurant.helpers;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.krzysztof.restaurant.model.MenuPosition;

public class Receipt {

	private Map<String, BigDecimal> nameAndCost = new HashMap<>();
	private BigDecimal totalCost = new BigDecimal(0);

	public void addMenuPositions(Collection<MenuPosition> menuPositions){
		menuPositions.stream().forEach(menuPosition -> {nameAndCost.put(menuPosition.getName(), menuPosition.getCost());
														totalCost = totalCost.add(menuPosition.getCost());});
	}
	
	public void addReceipt(Receipt receipt) {
		this.nameAndCost.putAll(receipt.nameAndCost);
		this.totalCost = this.totalCost.add(receipt.totalCost);
	}
	

}
