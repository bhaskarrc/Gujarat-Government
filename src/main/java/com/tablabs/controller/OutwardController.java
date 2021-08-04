package com.tablabs.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tablabs.model.OutputEntity;
import com.tablabs.service.UserService;

@RestController
public class OutwardController {

	@Autowired
	UserService service;

	@PostMapping("/save")
	public String saveEntry(@RequestBody OutputEntity outputEntity) {
		// database insertion stmt
		return "Data saved succesfully!";
	}

	@PatchMapping("/update/{id}")
	public String updateEntry(@RequestBody Map<String, Object> updates, @PathVariable String id) {
		// call service and update
		return "Data updated succesfully!";
	}

	@GetMapping("get/{id}")
	public OutputEntity getUser(@PathVariable int id) {
		return null;
	}

	@DeleteMapping("/delete/{srNo}")
	public String deleteEntry(@PathVariable int srNo) {
		// database delete stmt
		return "Data deleted successfully";
	}
}