package com.krzysztof.restaurant.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.validation.constraints.Digits;

@Entity
public class MenuPosition extends AbstractEntity {

	@Digits(integer = 7, fraction = 2)
	private BigDecimal cost;
	private String name;

	public BigDecimal getCost() {
		return cost;
	}

	public String getName() {
		return name;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MenuPosition [name=" + name + ", cost=" + cost + "]";
	}

}
