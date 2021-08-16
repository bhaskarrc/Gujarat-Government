package com.tablabs.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tablabs.DTO.OutwardEntryDTO;
import com.tablabs.DTO.OutwardListingResponseDTO;
import com.tablabs.DTO.OutwardUpdateEntryDTO;
import com.tablabs.model.Tdoi_outward_entry;
import com.tablabs.service.OutwardService;

@RestController()
@RequestMapping("DOI/Outward")
public class OutwardController {

	@Autowired
	OutwardService service;

	@PostMapping("/save")
	public String submitEntry(@RequestBody List<OutwardEntryDTO> outwardEntryDTO) {
		System.out.println(outwardEntryDTO);
		this.service.addOutwardEntry(outwardEntryDTO);
		return "Data entered succesfully!";
	}

	@GetMapping("/get")
	public List<OutwardListingResponseDTO> getUser(@RequestParam Map<String, String> outwardEntry) {
		if (outwardEntry.isEmpty()) {
			return this.service.getAll();
		}
		return this.service.getoutwardEntryByFieldName(outwardEntry);
	}
	
	@GetMapping("/get/{id}")
	public Tdoi_outward_entry getUser(@PathVariable long id) {
		return this.service.getOutwardEntryById(id);
	}

	/*
	 * @PutMapping("/update/{id}") public String updateEntry(@RequestBody
	 * OutwardEntryDTO outwardEntryDTO, @PathVariable long id) {
	 * this.service.updateOutwardEntry(outwardEntryDTO, id); return
	 * "Data updated succesfully!"; }
	 */
	@PutMapping("/update/{id}")
	public String updateEntry(@RequestBody OutwardUpdateEntryDTO outwardUpdateEntryDTO, @PathVariable long id) {
		this.service.updateOutwardEntry(outwardUpdateEntryDTO, id);
		return "Data updated succesfully!";
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEntry(@PathVariable long id) {
		service.deleteOutwardEntry(id);
		return "Data deleted successfully";
	}

}
