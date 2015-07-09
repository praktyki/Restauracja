package com.krzysztof.restaurant.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Order extends AbstractEntity{
	
	
	private Date creationDate;
	
	@Enumerated(EnumType.STRING)
	private Status orderStatus;
	
	
	
	public Status getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}


	public abstract BigDecimal getCost();
	
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}	
}
