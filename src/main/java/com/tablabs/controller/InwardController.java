package com.tablabs.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tablabs.DTO.InwardEntryDTO;
import com.tablabs.DTO.InwardListingResponseDTO;
import com.tablabs.service.InwardService;

@RestController
public class InwardController {

	@Autowired
	InwardService service;

	@PostMapping("/submit")
	public String submitEntry(@RequestBody List<InwardEntryDTO> inwardDTO) {
		this.service.addInwardEntry(inwardDTO);
		return "Data entered succesfully!";
	}

	@GetMapping("/get")
	public List<InwardListingResponseDTO> getUser(@RequestParam Map<String, String> inwardEntry) {
		if (inwardEntry.isEmpty()) {
			return this.service.getAll();
		}
		return this.service.getInwardEntryByFieldName(inwardEntry);
	}

//	@PutMapping("/update/{id}")
//	public void updateEntry(@RequestBody Map<String, String> inwardEntry, String id) {
//			InwardEntry fetchInwardEntry = service.getInwardEntry(id);
//
//		if (id != null) {
//			if (inwardEntry.get("inward_no") != null
//					&& Long.parseLong(inwardEntry.get("inward_no")) != fetchInwardEntry.getInward_no()) {
//				fetchInwardEntry.setInward_no(Long.parseLong(inwardEntry.get("inward_no")));
//			}
//
//			if (inwardEntry.get("inward_dt") != null
//					&& !inwardEntry.get("inward_dt").equals(fetchInwardEntry.getInward_dt().toString())) {
//				fetchInwardEntry.setInward_dt(LocalDate.parse(inwardEntry.get("inward_dt")));
//			}
//
//			if (inwardEntry.get("letter_type_id") != null
//					&& Long.parseLong(inwardEntry.get("letter_type_id")) != fetchInwardEntry.getLetter_type_id()) {
//				fetchInwardEntry.setLetter_type_id(Long.parseLong(inwardEntry.get("letter_type_id")));
//			}
//
//			if (inwardEntry.get("letter_type") != null
//					&& !inwardEntry.get("letter_type").equals(fetchInwardEntry.getLetter_type())) {
//				fetchInwardEntry.setLetter_type(inwardEntry.get("letter_type"));
//			}
//
//			if (inwardEntry.get("letter_no") != null
//					&& !inwardEntry.get("letter_no").equals(fetchInwardEntry.getLetter_no())) {
//				fetchInwardEntry.setLetter_no(inwardEntry.get("letter_no"));
//			}
//
//			if (inwardEntry.get("letter_dt") != null
//					&& !inwardEntry.get("letter_dt").equals(fetchInwardEntry.getLetter_dt().toString())) {
//				fetchInwardEntry.setLetter_dt(LocalDate.parse(inwardEntry.get("letter_dt")));
//			}
//
//			if (inwardEntry.get("letter_details") != null
//					&& !inwardEntry.get("letter_details").equals(fetchInwardEntry.getLetter_details())) {
//				fetchInwardEntry.setLetter_details(inwardEntry.get("letter_details"));
//			}
//
//			if (inwardEntry.get("from_where_details") != null
//					&& !inwardEntry.get("from_where_details").equals(fetchInwardEntry.getFrom_where_details())) {
//				fetchInwardEntry.setFrom_where_details(inwardEntry.get("from_where_details"));
//			}
//
//			if (inwardEntry.get("doi_branch_id") != null
//					&& Long.parseLong(inwardEntry.get("doi_branch_id")) != fetchInwardEntry.getDoi_branch_id()) {
//				fetchInwardEntry.setDoi_branch_id(Long.parseLong(inwardEntry.get("doi_branch_id")));
//			}
//
//			if (inwardEntry.get("doi_employee_id") != null
//					&& Long.parseLong(inwardEntry.get("doi_employee_id")) != fetchInwardEntry.getDoi_employee_id()) {
//				fetchInwardEntry.setDoi_employee_id(Long.parseLong(inwardEntry.get("doi_employee_id")));
//			}
//
//			if (inwardEntry.get("doi_employee_name") != null
//					&& !inwardEntry.get("doi_employee_name").equals(fetchInwardEntry.getDoi_employee_name())) {
//				fetchInwardEntry.setDoi_employee_name(inwardEntry.get("doi_employee_name"));
//			}
//
//			if (inwardEntry.get("reference_no") != null
//					&& !inwardEntry.get("reference_no").equals(fetchInwardEntry.getReference_no())) {
//				fetchInwardEntry.setReference_no(inwardEntry.get("reference_no"));
//			}
//
//			if (inwardEntry.get("reference_dt") != null
//					&& !inwardEntry.get("reference_dt").equals(fetchInwardEntry.getReference_dt().toString())) {
//				fetchInwardEntry.setReference_dt(LocalDateTime.parse(inwardEntry.get("reference_dt")));
//			}
//
//			if (inwardEntry.get("active_status") != null
//					&& Integer.parseInt(inwardEntry.get("active_status")) != fetchInwardEntry.getActive_status()) {
//				fetchInwardEntry.setActive_status(Integer.parseInt(inwardEntry.get("active_status")));
//			}
//
//			if (inwardEntry.get("created_date") != null
//					&& !inwardEntry.get("created_date").equals(fetchInwardEntry.getCreated_date().toString())) {
//				fetchInwardEntry.setCreated_date(LocalDateTime.parse(inwardEntry.get("created_date")));
//			}
//
//			if (inwardEntry.get("created_by") != null
//					&& Long.parseLong(inwardEntry.get("created_by")) != fetchInwardEntry.getCreated_by()) {
//				fetchInwardEntry.setCreated_by(Long.parseLong(inwardEntry.get("created_by")));
//			}
//
//			if (inwardEntry.get("created_by_post") != null
//					&& Long.parseLong(inwardEntry.get("created_by_post")) != fetchInwardEntry.getCreated_by_post()) {
//				fetchInwardEntry.setCreated_by_post(Long.parseLong(inwardEntry.get("created_by_post")));
//			}
//
//			if (inwardEntry.get("updated_date") != null
//					&& !inwardEntry.get("updated_date").equals(fetchInwardEntry.getUpdated_date().toString())) {
//				fetchInwardEntry.setUpdated_date(LocalDateTime.parse(inwardEntry.get("updated_date")));
//			}
//
//			if (inwardEntry.get("updated_by") != null
//					&& Long.parseLong(inwardEntry.get("updated_by")) != fetchInwardEntry.getUpdated_by()) {
//				fetchInwardEntry.setUpdated_by(Long.parseLong(inwardEntry.get("updated_by")));
//			}
//
//			if (inwardEntry.get("updated_by_post") != null
//					&& Long.parseLong(inwardEntry.get("updated_by_post")) != fetchInwardEntry.getUpdated_by_post()) {
//				fetchInwardEntry.setUpdated_by_post(Long.parseLong(inwardEntry.get("updated_by_post")));
//			}
//		}
//
//		service.updateInwardEntry(fetchInwardEntry);
//	}

	@DeleteMapping("/delete/{id}")
	public String deleteEntry(@PathVariable String id) {
		service.deleteInwardEntry(id);
		return "Data deleted successfully";
	}
}
