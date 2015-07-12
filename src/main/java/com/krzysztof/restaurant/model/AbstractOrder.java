package com.krzysztof.restaurant.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;

import com.krzysztof.restaurant.helpers.Receipt;

@Entity
@Inheritance
public abstract class AbstractOrder extends AbstractEntity {

	private Date creationDate;

	@Enumerated(EnumType.STRING)
	private Status orderStatus;

	public Status getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public abstract Receipt getReceipt();
	
}