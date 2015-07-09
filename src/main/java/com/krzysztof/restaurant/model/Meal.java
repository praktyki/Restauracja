package com.krzysztof.restaurant.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public class Meal extends AbstractEntity {
	
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
}
