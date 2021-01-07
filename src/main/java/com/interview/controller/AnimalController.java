package com.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.model.Animal;
import com.interview.service.AnimalService;
import com.interview.service.AnimalServiceImpl;

@RestController
public class AnimalController {
	
	@Autowired
	private AnimalServiceImpl animal;
	
	@GetMapping(value = "/hewan")
	public AnimalService getAnimal() {
		return  animal.getAllAnimal();
	}
}
