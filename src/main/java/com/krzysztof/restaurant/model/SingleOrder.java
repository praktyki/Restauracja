package com.krzysztof.restaurant.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Inheritance;


@Entity
@Inheritance
public class SingleOrder extends Order{
	
	private Meal meal;
	
	
	
	public Meal getMeal() {
		return meal;
	}



	public void setMeal(Meal meal) {
		this.meal = meal;
	}



	@Override
	public BigDecimal getCost() {
		// TODO Auto-generated method stub
		return null;
	}

}
