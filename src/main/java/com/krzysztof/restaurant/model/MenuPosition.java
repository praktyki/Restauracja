package com.krzysztof.restaurant.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.validation.constraints.Digits;


@Entity
public class MenuPosition extends AbstractEntity {
	
	private String name;
	@Digits(integer=7, fraction=2)
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
