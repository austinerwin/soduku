package com.cooksys.soduku.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cooksys.soduku.dto.TableDto;
import com.cooksys.soduku.entity.Table;

@Service
public class TableService {

	private ArrayList<Table> tables = new ArrayList<>();
	private Integer tableIdGenerator = 0;
	
	public Set<TableDto> getAllTables() {
		return tables.stream().map(this::toDto).collect(Collectors.toSet());
	}

	public TableDto getById(Integer id) {
		return toDto(tables.get(id));
	}

	public TableDto createTable(TableDto makeIt) {
		Table realTable = fromDto(makeIt);
		tables.add(realTable);
		realTable.setId(tableIdGenerator++);
		return makeIt;
	}

	public Table get(Integer tableId) {
		return tables.get(tableId);
	}
	
	public TableDto toDto(Table convertMe) {
		return new TableDto(convertMe.getName());
	}
	
	public Table fromDto(TableDto convertMe) {
		return new Table(convertMe.getName());
	}

}
