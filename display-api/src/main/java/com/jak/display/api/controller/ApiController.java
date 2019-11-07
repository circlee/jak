package com.jak.display.api.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jak.display.core.entity.Display;
import com.jak.display.core.repository.DisplayRepository;


@RestController
public class ApiController {

	@Autowired
	DisplayRepository displayRepository;
	
	@GetMapping("/test")
	public String testApi() {
		return "is OK";
	}
	
	@PostMapping("/displays")
	public Display createProduct() {
		Display display = displayRepository.save(new Display(LocalDateTime.now().toString()));
		return display;
	}
	
	@GetMapping("/displays")
	public List<Display> selectProduct() {
		List<Display> displays = new ArrayList<>();
		displayRepository.findAll().forEach(displays::add);
		return displays;
	}
	
}
