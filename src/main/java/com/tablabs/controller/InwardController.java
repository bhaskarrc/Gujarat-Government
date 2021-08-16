package com.tablabs.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tablabs.DTO.InwardEntryDTO;
import com.tablabs.DTO.InwardListingResponseDTO;
import com.tablabs.DTO.InwardUpdateEntryDTO;
import com.tablabs.model.Tdoi_inward_entry;
import com.tablabs.service.InwardService;

@RestController
@RequestMapping("DOI/inward")
@CrossOrigin()
public class InwardController {

	@Autowired
	InwardService service;

	@PostMapping("/save")
	public String submitEntry(@RequestBody List<InwardEntryDTO> inwardEntryDTO) {
		System.out.println(inwardEntryDTO);
		this.service.addInwardEntry(inwardEntryDTO);
		return "Data entered succesfully!";
	}

	@GetMapping("/get")
	public List<InwardListingResponseDTO> getUser(@RequestParam Map<String, String> inwardEntry) {
		if (inwardEntry.isEmpty()) {
			return this.service.getAll();
		}
		return this.service.getInwardEntryByFieldName(inwardEntry);
	}

	@GetMapping("/get/{id}")
	public Tdoi_inward_entry getUser(@PathVariable long id) {
		return this.service.getInwardEntryById(id);
	}

	@PutMapping("/update/{id}")
	public String updateEntry(@RequestBody InwardUpdateEntryDTO inwardUpdateEntryDTO, @PathVariable long id) {
		this.service.updateInwardEntry(inwardUpdateEntryDTO, id);
		return "Data updated succesfully!";
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEntry(@PathVariable long id) {
		service.deleteInwardEntry(id);
		return "Data deleted successfully";
	}
}
