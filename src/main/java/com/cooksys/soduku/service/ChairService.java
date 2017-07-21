package com.cooksys.soduku.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cooksys.soduku.dto.ChairDto;
import com.cooksys.soduku.dto.ChairDtoWithId;
import com.cooksys.soduku.dto.TableDto;
import com.cooksys.soduku.entity.Chair;
import com.cooksys.soduku.entity.Table;
import com.cooksys.soduku.mapstruct.ChairMapper;
import com.cooksys.soduku.mapstruct.TableMapper;
import com.cooksys.soduku.repository.ChairRepository;
import com.cooksys.soduku.repository.TableRepository;

@Service
public class ChairService {

	private ChairMapper chairMapper;
	private ChairRepository chairRepo;
	private TableRepository tableRepo;
	private TableMapper tableMapper;

	public ChairService(TableRepository tableRepo, TableMapper tableMapper, ChairRepository chairRepo, ChairMapper chairMapper) {
		this.chairMapper = chairMapper;
		this.chairRepo = chairRepo;
		this.tableRepo = tableRepo;
		this.tableMapper = tableMapper;
	}

	public List<ChairDtoWithId> getAll() {
		return chairRepo.getAll().stream().map(chairMapper::toDtoWithId).collect(Collectors.toList());
	}

	public ChairDto findById(Integer id) {
		return chairMapper.toDto(chairRepo.getById(id));
	}

	public boolean create(ChairDto buildIt) {

		if (buildIt.getNumberOfLegs() < 4)
			return false;

		Chair realChair = chairMapper.fromDto(buildIt);

		chairRepo.addChair(realChair);

		return true;
	}

	public TableDto findTableByChairId(Integer chairId) {
		return tableMapper.toDto(chairRepo.getById(chairId).getTable());
	}

	public void addTable(Integer chairId, Integer tableId) {
		Chair chair = chairRepo.getById(chairId);
		Table table = tableRepo.get(tableId);
		
		chair.setTable(table);
		
		chairRepo.updateChair(chair);
	}

}
