package com.cooksys.soduku.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cooksys.soduku.entity.Chair;

public interface ChairRepository extends JpaRepository<Chair, Integer>{

	public List<Chair> getByNumberOfLegsGreaterThan(Integer numberOfLegs);
	
	public List<Chair> getByItemDetailPriceLessThan(Double maxPrice);
	
}
