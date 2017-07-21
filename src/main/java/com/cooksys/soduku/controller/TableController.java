package com.cooksys.soduku.controller;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.soduku.dto.TableDto;
import com.cooksys.soduku.dto.TableDtoWithId;
import com.cooksys.soduku.service.TableService;

@RestController
@RequestMapping("table")
public class TableController {

	TableService tableService;
	
	public TableController(TableService tableService) {
		this.tableService = tableService;
	}
	
	@GetMapping
	public Set<TableDtoWithId> getAll() {
		return tableService.getAllTables();
	}
	
	@GetMapping("{id}")
	public TableDto getById(@PathVariable Integer id) {
		return tableService.getById(id);
	}
	
	@PostMapping
	public TableDto makeATable(@RequestBody TableDto makeIt) {
		return tableService.createTable(makeIt);
	}
	
}
