package com.krzysztof.restaurant.model;

import java.math.BigDecimal;

public class Meal {
	
	private long mealId;
	private String name;
	private BigDecimal cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public long getMealId() {
		return mealId;
	}
	public void setMealId(long mealId) {
		this.mealId = mealId;
	}
}
