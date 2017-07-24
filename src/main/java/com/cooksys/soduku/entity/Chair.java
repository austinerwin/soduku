package com.cooksys.soduku.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Chair {

	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer numberOfLegs;

	@Embedded
	private ItemDetail itemDetail;
	
	@ManyToOne
	private Table table;
	
	public Chair() {

	}
	
	public Chair(Integer id, Integer numberOfLegs, ItemDetail itemDetail, Table table) {
		super();
		this.id = id;
		this.numberOfLegs = numberOfLegs;
		this.itemDetail = itemDetail;
		this.table = table;
	}
	
	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

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

	public ItemDetail getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(ItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chair other = (Chair) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
