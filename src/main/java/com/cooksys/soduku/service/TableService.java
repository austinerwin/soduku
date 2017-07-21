package com.cooksys.soduku.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cooksys.soduku.dto.TableDto;
import com.cooksys.soduku.dto.TableDtoWithId;
import com.cooksys.soduku.entity.Table;
import com.cooksys.soduku.mapstruct.TableMapper;
import com.cooksys.soduku.repository.TableRepository;

@Service
public class TableService {
	
	private TableRepository repo;
	private TableMapper mapper;

	public TableService(TableRepository repo, TableMapper mapper) {
		this.repo = repo;
		this.mapper = mapper;
	}
	
	public Set<TableDtoWithId> getAllTables() {
		return repo.getAll().stream().map(mapper::toDtoWithId).collect(Collectors.toSet());
	}

	public TableDto getById(Integer id) {
		return mapper.toDto(repo.get(id));
	}

	public TableDto createTable(TableDto makeIt) {
		Table realTable = mapper.fromDto(makeIt);
		repo.add(realTable);
		return mapper.toDto(realTable);
	}

	public Table get(Integer tableId) {
		return repo.get(tableId);
	}

}