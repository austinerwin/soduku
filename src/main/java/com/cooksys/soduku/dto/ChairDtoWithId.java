package com.cooksys.soduku.dto;

public class ChairDtoWithId {

	private Integer id;
	private Integer numberOfLegs;
	private Double price;
	private Integer serialNumber;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(Integer numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}	
}
