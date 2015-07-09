package com.krzysztof.restaurant.model;

import java.math.BigDecimal;
import java.sql.Date;

public abstract class Order extends Entity{

	private Date creationDate;
	private Status orderStatus;
	public abstract BigDecimal getCost();
	
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Status getStatusOfOrder() {
		return orderStatus;
	}

	public void setStatusOfOrder(Status statusOfOrder) {
		this.orderStatus = statusOfOrder;
	}
	
}
