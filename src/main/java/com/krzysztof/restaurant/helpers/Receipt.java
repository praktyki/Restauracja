package com.krzysztof.restaurant.helpers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import com.krzysztof.restaurant.model.MenuPosition;

public class Receipt {

	private Collection<MenuPosition> menuPositions = new ArrayList<>();
	private BigDecimal totalCost = new BigDecimal(0);

	public void addMenuPositions(Collection<MenuPosition> menuPositionsToAdd){
		menuPositionsToAdd.stream().forEach(menuPosition -> {menuPositions.add(menuPosition);
														totalCost = totalCost.add(menuPosition.getCost());});
	}
	
	public void addReceipt(Receipt receipt) {
		this.menuPositions.addAll(receipt.menuPositions);
		this.totalCost = this.totalCost.add(receipt.totalCost);
	}
	
	public Receipt(Collection<MenuPosition> collectionOfMenuPositions){
		addMenuPositions(collectionOfMenuPositions);
	}
	
	public Receipt(){};
	

}
