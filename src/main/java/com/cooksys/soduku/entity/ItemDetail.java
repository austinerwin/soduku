package com.cooksys.soduku.entity;

import javax.persistence.Embeddable;

@Embeddable
public class ItemDetail {

	private Integer serialNumber;
	private Double price;
	
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
