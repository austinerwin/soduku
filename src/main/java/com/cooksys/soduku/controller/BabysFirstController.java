package com.cooksys.soduku.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.soduku.entity.Chair;
import com.cooksys.soduku.service.ChairService;

@RestController
@RequestMapping("sears")
public class BabysFirstController {

	private ChairService chairService;

	public BabysFirstController(ChairService chairService) {
		this.chairService = chairService;
	}
	
	@GetMapping
	public List<Chair> sayHelloToMyLittleChair() {
		return chairService.getAll();
	}
	
	@GetMapping("{id}")
	public Chair getChairById(@PathVariable Integer id) {
		return chairService.findById(id);
	}
	
	@PostMapping
	public Chair buildAChair(@RequestBody Chair buildIt) {
		return chairService.create(buildIt);
	}
	
}
