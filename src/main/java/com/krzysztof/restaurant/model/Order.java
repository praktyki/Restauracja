package com.krzysztof.restaurant.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Order extends Entity{
	
	private Date creationDate;
	
	@Enumerated
	private Status orderStatus;
	private Long tableId;
	
	public Status getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getTableId() {
		return tableId;
	}

	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}

	public abstract BigDecimal getCost();
	
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}	
}
