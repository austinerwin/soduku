package com.cooksys.soduku.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cooksys.soduku.controller.ChairDtoWithId;
import com.cooksys.soduku.dto.ChairDto;
import com.cooksys.soduku.dto.TableDto;
import com.cooksys.soduku.entity.Chair;
import com.cooksys.soduku.mapstruct.ChairMapper;

@Service
public class ChairService {

	private Integer idGenerator = 0;
	private List<Chair> chairList = new ArrayList<Chair>();
	
	private TableService tableService;
	private ChairMapper chairMapper;
	
	public ChairService(TableService tableService, ChairMapper chairMapper) {
		this.tableService = tableService;
		this.chairMapper = chairMapper;
	}

	public List<ChairDtoWithId> getAll() {
		return chairList.stream().map(
				chairMapper::toDtoWithId
				).collect(Collectors.toList());
	}

	public ChairDto findById(Integer id) {
		return toChairDto(chairList.get(id));
	}

	public boolean create(ChairDto buildIt) {
		
		if(buildIt.getNumberOfLegs() < 4)
			return false;
		
		Chair realChair = chairMapper.fromDto(buildIt);
		
		realChair.setId(idGenerator++);
		chairList.add(realChair);
		return true;
	}

	public Chair toChair(ChairDto transformMe) {
		return new Chair(null, transformMe.getNumberOfLegs(), transformMe.getPrice(), null);
	}
	
	public ChairDto toChairDto(Chair transformMe) {
		return new ChairDto(transformMe.getNumberOfLegs(), transformMe.getPrice());
	}

	public TableDto findTableByChairId(Integer chairId) {
		return tableService.getById(chairList.get(chairId).getTable().getId());
	}

	public void addTable(Integer chairId, Integer tableId) {
		chairList.get(chairId).setTable(tableService.get(tableId));
		tableService.get(tableId).getChairs().add(chairList.get(chairId));
	}
	
}
