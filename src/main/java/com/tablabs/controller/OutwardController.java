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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tablabs.DTO.Outward_Entry_DTO;
import com.tablabs.model.Outward_Entry;
import com.tablabs.model.Outward_Entry;
import com.tablabs.service.OutwardService;

@RestController
public class OutwardController {

	@Autowired
	OutwardService service;

	@PostMapping("/submit")
	public String submitEntry(@RequestBody Outward_Entry inputEntity) {
		this.service.addOutwardEntry(inputEntity);
		return "Data entered succesfully!";
	}

	@GetMapping("/get/{id}")
	public Outward_Entry getUser(@RequestParam String id) {
		return this.service.getOutwardEntry(id);
	}

	@PutMapping("/update/{id}")
	public void updateEntry(@RequestBody Outward_Entry_DTO OutwardEntry) {
		this.service.updateOutwardEntry(OutwardEntry);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEntry(@PathVariable String id) {
		service.deleteOutwardEntry(id);
		return "Data deleted successfully";
	}
}
