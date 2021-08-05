package com.tablabs.controller;

import java.time.LocalDate;
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

import com.tablabs.DTO.Inward_Entry_DTO;
import com.tablabs.model.Inward_Entry;
import com.tablabs.service.InwardService;

@RestController
public class InwardController {

	@Autowired
	InwardService service;

	@PostMapping("/submit")
	public String submitEntry(@RequestBody Inward_Entry inputEntity) {
		this.service.addInwardEntry(inputEntity);
		return "Data entered succesfully!";
	}

	@GetMapping("/get/{id}")
	public Inward_Entry getUser(@RequestParam String id) {
		return this.service.getInwardEntry(id);
	}

	@PutMapping("/update/{id}")
	public void updateEntry(@RequestBody Map<String, String> inwardEntry, String id) {
		Inward_Entry fetchInwardEntry;

		if (id != null) {
			fetchInwardEntry = service.getInwardEntry(id);

			if (inwardEntry.get("inward_no") != null
					&& Long.parseLong(inwardEntry.get("inward_no")) != fetchInwardEntry.getInward_no()) {
				fetchInwardEntry.setInward_no(Long.parseLong(inwardEntry.get("inward_no")));
			}

			if (inwardEntry.get("inward_dt") != null
					&& !inwardEntry.get("inward_dt").equals(fetchInwardEntry.getInward_dt().toString())) {
				fetchInwardEntry.setInward_dt(LocalDate.parse(inwardEntry.get("inward_dt")));
			}
			
		}
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEntry(@PathVariable String id) {
		service.deleteInwardEntry(id);
		return "Data deleted successfully";
	}
}
