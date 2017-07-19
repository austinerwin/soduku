package com.cooksys.soduku.entity;

import java.util.HashSet;
import java.util.Set;

public class Table {

	private Integer id;
	private String name;
	private Set<Chair> chairs = new HashSet<Chair>();
	
	public Table(String name) {
		this.name = name;
	}
	
	public Table() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Chair> getChairs() {
		return chairs;
	}
	public void setChairs(Set<Chair> chairs) {
		this.chairs = chairs;
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
		Table other = (Table) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
