package com.cooksys.soduku.dto;

public class TableDto {
	
	private String name;
	private Double price;
	private Integer serialNumber;

	public TableDto() {
		// TODO Auto-generated constructor stub
	}
	
	public TableDto(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
