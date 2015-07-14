package com.krzysztof.restaurant.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.krzysztof.restaurant.helpers.Receipt;

@Entity
@Inheritance
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "class")
@JsonSubTypes(value = { @Type(value = SingleOrder.class, name = "single"),
		@Type(value = GroupOrder.class, name = "group") })
public abstract class AbstractOrder extends AbstractEntity {

	private Date creationDate;

	@Enumerated(EnumType.STRING)
	private Status orderStatus;

	public abstract Receipt fetchReceipt();

	public Date getCreationDate() {
		return creationDate;
	}

	public Status getOrderStatus() {
		return orderStatus;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}

}
