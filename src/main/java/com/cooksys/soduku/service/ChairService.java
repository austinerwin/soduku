package com.cooksys.soduku.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.cooksys.soduku.entity.Chair;

@Service
public class ChairService {

	private Integer idGenerator = 0;
	private List<Chair> chairList = new ArrayList<Chair>();

	public List<Chair> getAll() {
		// TODO Auto-generated method stub
		return chairList;
	}

	public Chair findById(Integer id) {
		// TODO Auto-generated method stub
		return chairList.get(id);
	}

	public Chair create(Chair buildIt) {
		buildIt.setId(idGenerator++);
		chairList.add(buildIt);
		return buildIt;
	}

	
	
}
