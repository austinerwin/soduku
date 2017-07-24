package com.cooksys.soduku.dto;

public class ChairDto {

	private Integer numberOfLegs;
	private Double price;
	private Integer serialNumber;
	
	public ChairDto() {
		// TODO Auto-generated constructor stub
	}
	
	public ChairDto(Integer numberOfLegs, Double price) {
		super();
		this.numberOfLegs = numberOfLegs;
		this.price = price;
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
