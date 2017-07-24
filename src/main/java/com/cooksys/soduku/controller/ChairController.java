package com.cooksys.soduku.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.soduku.dto.ChairDto;
import com.cooksys.soduku.dto.ChairDtoWithId;
import com.cooksys.soduku.dto.TableDto;
import com.cooksys.soduku.service.ChairService;

@RestController
@RequestMapping("chair")
public class ChairController {

	private ChairService chairService;

	public ChairController(ChairService chairService) {
		this.chairService = chairService;
	}
	
	//doin chair stuff
	@GetMapping
	public List<ChairDtoWithId> sayHelloToMyLittleChair( @RequestParam(value = "numberOfLegs", required = false) Integer numberOfLegs) {
		return chairService.getAll(numberOfLegs);
	}
	
	@GetMapping("{id}")
	public ChairDto getChairById(@PathVariable Integer id) {
		return chairService.findById(id);
	}
	
	//super cool status code example
	@PostMapping
	public void buildAChair(@RequestBody ChairDto buildIt, HttpServletResponse response) {
		
		if(chairService.create(buildIt))
			response.setStatus(HttpServletResponse.SC_CREATED);
		else
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	}
	
	//table time
	@GetMapping("{chairId}/table")
	public TableDto getTable(@PathVariable Integer chairId) {
		return chairService.findTableByChairId(chairId);
	}
	
	@PatchMapping("{chairId}/table/{tableId}")
	public void addTableAsOwner(@PathVariable Integer chairId, @PathVariable Integer tableId) {
		chairService.addTable(chairId, tableId);
	}
}
