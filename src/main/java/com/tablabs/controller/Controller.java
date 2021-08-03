package com.tablabs.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tablabs.model.UserEntity;
import com.tablabs.service.UserService;

@RestController
public class Controller {

	@Autowired
	UserService service;

	@PostMapping("/submit")
	public String submitEntry(@RequestParam int serialNumber, @RequestParam String letterNumber,
			@RequestParam Date date, @RequestParam String fromEntity, @RequestParam String toUnit) {
		// database insertion stmt
		return "Data submitted succesfully!";
	}

	@PutMapping("/update")
	public String updateEntry(@RequestParam int serialNumber, @RequestParam String letterNumber,
			@RequestParam Date date, @RequestParam String fromEntity, @RequestParam String toUnit) {
		// database insertion stmt
		return "Data updated succesfully!";
	}

//	@PutMapping("get/{id}")
//	public UserEntity getUser(@PathVariable int id) {
//		
//	}
}
