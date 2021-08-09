package com.tablabs.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tablabs.model.OutwardEntry;
import com.tablabs.service.OutwardService;

@RestController
public class OutwardController {
//
//	@Autowired
//	OutwardService service;
//
//	@PostMapping("/submit")
//	public String submitEntry(@RequestBody OutwardEntry inputEntity) {
//		this.service.addOutwardEntry(inputEntity);
//		return "Data entered succesfully!";
//	}
//
//	@GetMapping("/get/{id}")
//	public OutwardEntry getUser(@RequestParam String id) {
//		return this.service.getOutwardEntry(id);
//	}
//
//	@PutMapping("/update/{id}")
//	public void updateEntry(@RequestBody Map<String, String> outwardEntry, String id) {
//		OutwardEntry fetchOutwardEntry = service.getOutwardEntry(id);
//
//		if (id != null) {
//			if (outwardEntry.get("outward_no") != null
//					&& Long.parseLong(outwardEntry.get("outward_no")) != fetchOutwardEntry.getOutward_no()) {
//				fetchOutwardEntry.setOutward_no(Long.parseLong(outwardEntry.get("outward_no")));
//			}
//
//			if (outwardEntry.get("outward_dt") != null
//					&& !outwardEntry.get("outward_dt").equals(fetchOutwardEntry.getOutward_dt().toString())) {
//				fetchOutwardEntry.setOutward_dt(LocalDate.parse(outwardEntry.get("outward_dt")));
//			}
//
//			if (outwardEntry.get("letter_type_id") != null
//					&& Long.parseLong(outwardEntry.get("letter_type_id")) != fetchOutwardEntry.getLetter_type_id()) {
//				fetchOutwardEntry.setLetter_type_id(Long.parseLong(outwardEntry.get("letter_type_id")));
//			}
//
//			if (outwardEntry.get("letter_type") != null
//					&& !outwardEntry.get("letter_type").equals(fetchOutwardEntry.getLetter_type())) {
//				fetchOutwardEntry.setLetter_type(outwardEntry.get("letter_type"));
//			}
//
//			if (outwardEntry.get("inward_letter_no") != null
//					&& !outwardEntry.get("inward_letter_no").equals(fetchOutwardEntry.getInward_letter_no())) {
//				fetchOutwardEntry.setInward_letter_no(outwardEntry.get("inward_letter_no"));
//			}
//
//			if (outwardEntry.get("letter_details") != null
//					&& !outwardEntry.get("letter_details").equals(fetchOutwardEntry.getLetter_details())) {
//				fetchOutwardEntry.setLetter_details(outwardEntry.get("letter_details"));
//			}
//
//			if (outwardEntry.get("sent_to_details") != null
//					&& !outwardEntry.get("sent_to_details").equals(fetchOutwardEntry.getSent_to_details())) {
//				fetchOutwardEntry.setSent_to_details(outwardEntry.get("sent_to_details"));
//			}
//
//			if (outwardEntry.get("frm_branch_id") != null
//					&& Long.parseLong(outwardEntry.get("frm_branch_id")) != fetchOutwardEntry.getFrm_branch_id()) {
//				fetchOutwardEntry.setFrm_branch_id(Long.parseLong(outwardEntry.get("frm_branch_id")));
//			}
//
//			if (outwardEntry.get("outward_mode_id") != null
//					&& Long.parseLong(outwardEntry.get("outward_mode_id")) != fetchOutwardEntry.getOutward_mode_id()) {
//				fetchOutwardEntry.setOutward_mode_id(Long.parseLong(outwardEntry.get("outward_mode_id")));
//			}
//
//			if (outwardEntry.get("outward_amt") != null
//					&& Double.parseDouble(outwardEntry.get("outward_amt")) != fetchOutwardEntry.getOutward_amt()) {
//				fetchOutwardEntry.setOutward_amt(Double.parseDouble(outwardEntry.get("outward_amt")));
//			}
//
//			if (outwardEntry.get("remarks") != null
//					&& !outwardEntry.get("remarks").equals(fetchOutwardEntry.getRemarks())) {
//				fetchOutwardEntry.setRemarks(outwardEntry.get("remarks"));
//			}
//
//			if (outwardEntry.get("reference_no") != null
//					&& !outwardEntry.get("reference_no").equals(fetchOutwardEntry.getReference_no())) {
//				fetchOutwardEntry.setReference_no(outwardEntry.get("reference_no"));
//			}
//
//			if (outwardEntry.get("reference_dt") != null
//					&& !outwardEntry.get("reference_dt").equals(fetchOutwardEntry.getReference_dt().toString())) {
//				fetchOutwardEntry.setReference_dt(LocalDateTime.parse(outwardEntry.get("reference_dt")));
//			}
//
//			if (outwardEntry.get("active_status") != null
//					&& Integer.parseInt(outwardEntry.get("active_status")) != fetchOutwardEntry.getActive_status()) {
//				fetchOutwardEntry.setActive_status(Integer.parseInt(outwardEntry.get("active_status")));
//			}
//
//			if (outwardEntry.get("created_date") != null
//					&& !outwardEntry.get("created_date").equals(fetchOutwardEntry.getCreated_date().toString())) {
//				fetchOutwardEntry.setCreated_date(LocalDateTime.parse(outwardEntry.get("created_date")));
//			}
//
//			if (outwardEntry.get("created_by") != null
//					&& Long.parseLong(outwardEntry.get("created_by")) != fetchOutwardEntry.getCreated_by()) {
//				fetchOutwardEntry.setCreated_by(Long.parseLong(outwardEntry.get("created_by")));
//			}
//
//			if (outwardEntry.get("created_by_post") != null
//					&& Long.parseLong(outwardEntry.get("created_by_post")) != fetchOutwardEntry.getCreated_by_post()) {
//				fetchOutwardEntry.setCreated_by_post(Long.parseLong(outwardEntry.get("created_by_post")));
//			}
//
//			if (outwardEntry.get("updated_date") != null
//					&& !outwardEntry.get("updated_date").equals(fetchOutwardEntry.getUpdated_date().toString())) {
//				fetchOutwardEntry.setUpdated_date(LocalDateTime.parse(outwardEntry.get("updated_date")));
//			}
//
//			if (outwardEntry.get("updated_by") != null
//					&& Long.parseLong(outwardEntry.get("updated_by")) != fetchOutwardEntry.getUpdated_by()) {
//				fetchOutwardEntry.setUpdated_by(Long.parseLong(outwardEntry.get("updated_by")));
//			}
//
//			if (outwardEntry.get("updated_by_post") != null
//					&& Long.parseLong(outwardEntry.get("updated_by_post")) != fetchOutwardEntry.getUpdated_by_post()) {
//				fetchOutwardEntry.setUpdated_by_post(Long.parseLong(outwardEntry.get("updated_by_post")));
//			}
//
//		}
//
//		service.updateOutwardEntry(fetchOutwardEntry);
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public String deleteEntry(@PathVariable String id) {
//		service.deleteOutwardEntry(id);
//		return "Data deleted successfully";
//	}
}
