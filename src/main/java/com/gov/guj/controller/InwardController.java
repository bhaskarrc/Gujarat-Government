package com.gov.guj.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.gov.guj.DTO.InwardEntryDTO;
import com.gov.guj.DTO.InwardListingResponseDTO;
import com.gov.guj.DTO.InwardUpdateEntryDTO;
import com.gov.guj.model.JsonObjectFormat;
import com.gov.guj.model.Tdoi_inward_entry;
import com.gov.guj.service.InwardService;

@RestController
@RequestMapping("DOI/inward")
@CrossOrigin()
public class InwardController {

	@Autowired
	InwardService service;

	@PostMapping("/save")
	public ResponseEntity<String> submitEntry(@RequestBody List<InwardEntryDTO> inwardEntryDTO)
			throws JsonProcessingException {
		JsonObjectFormat jsonobjectFormat;

		try {
			if (inwardEntryDTO != null && !inwardEntryDTO.isEmpty()) {
				List<Tdoi_inward_entry> inwardEntry = this.service.addInwardEntry(inwardEntryDTO);
				jsonobjectFormat = new JsonObjectFormat("Data Save successfully", true, inwardEntry);
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				ObjectMapper obj = new ObjectMapper();
				obj.registerModule(new JavaTimeModule());
				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				obj.setDateFormat(df);
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.ok().body(customStr);
				
			} else {
				jsonobjectFormat = new JsonObjectFormat("No data entered", false, "");
				ObjectMapper obj = new ObjectMapper();
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.badRequest().body(customStr);
			}
		} catch (Exception e) {
			jsonobjectFormat = new JsonObjectFormat("Unable to save data", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.internalServerError().body(customStr);
		}
	}
	
	@GetMapping("/maxInwardNo")
	public ResponseEntity<String> getMaxInwardNumber() throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;
		
		try {
			Long maxInward = this.service.getMaxInwardNumber();
			jsonobjectFormat = new JsonObjectFormat("Fetched data successfully", true, maxInward);
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.ok().body(customStr);
		} catch (Exception e) {
			jsonobjectFormat = new JsonObjectFormat("Unable to fetch data", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.internalServerError().body(customStr);
		}
	}

	@PostMapping("/get")
	public ResponseEntity<String> getUser(@RequestBody Map<String, String> inwardEntry) throws JsonProcessingException {
		System.out.println(inwardEntry);

		JsonObjectFormat jsonobjectFormat;

		try {
			if (inwardEntry.isEmpty()) {
				List<InwardListingResponseDTO> inwardListingResponseList = this.service.getAll();
				jsonobjectFormat = new JsonObjectFormat("Fetched every data", true, inwardListingResponseList);
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				ObjectMapper obj = new ObjectMapper();
				obj.registerModule(new JavaTimeModule());
				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				obj.setDateFormat(df);
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.ok().body(customStr);

			} else {
				List<InwardListingResponseDTO> inwardListingResponseList = this.service
						.getInwardEntryByFieldName(inwardEntry);
				jsonobjectFormat = new JsonObjectFormat("Data fetched successfully!", true, inwardListingResponseList);
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				ObjectMapper obj = new ObjectMapper();
				obj.registerModule(new JavaTimeModule());
				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				obj.setDateFormat(df);
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.ok().body(customStr);
			}
		} catch (Exception e) {
			jsonobjectFormat = new JsonObjectFormat("Unable to fetch data", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.internalServerError().body(customStr);
		}
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<String> getUser(@PathVariable Long id) throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (id != null) {

				Tdoi_inward_entry updateResponse = this.service.getInwardEntryById(id);
				jsonobjectFormat = new JsonObjectFormat("Data fecthed for the id: " + id, true, updateResponse);
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				ObjectMapper obj = new ObjectMapper();
				obj.registerModule(new JavaTimeModule());
				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				obj.setDateFormat(df);
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.ok().body(customStr);

			} else {
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				ObjectMapper obj = new ObjectMapper();
				obj.registerModule(new JavaTimeModule());
				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				obj.setDateFormat(df);
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString("No id entered");
				return ResponseEntity.badRequest().body(customStr);
			}
		} catch (Exception e) {
			jsonobjectFormat = new JsonObjectFormat("Unable to fetch data", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.internalServerError().body(customStr);
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateEntry(@RequestBody InwardUpdateEntryDTO inwardUpdateEntryDTO,
			@PathVariable Long id) throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (id != null) {
				Tdoi_inward_entry updateResponse = this.service.updateInwardEntry(inwardUpdateEntryDTO, id);
				jsonobjectFormat = new JsonObjectFormat("Data successfully updated for id: " + id, true,
						updateResponse);
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				ObjectMapper obj = new ObjectMapper();
				obj.registerModule(new JavaTimeModule());
				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				obj.setDateFormat(df);
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.ok().body(customStr);

			} else {
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				ObjectMapper obj = new ObjectMapper();
				obj.registerModule(new JavaTimeModule());
				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				obj.setDateFormat(df);
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString("No id entered");
				return ResponseEntity.badRequest().body(customStr);
			}
		} catch (Exception e) {
			jsonobjectFormat = new JsonObjectFormat("Unable to fetch data", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.internalServerError().body(customStr);
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEntry(@PathVariable Long id) throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (id != null) {
				this.service.deleteInwardEntry(id);
				jsonobjectFormat = new JsonObjectFormat("Data deleted for the id: " + id, true, "");
				ObjectMapper obj = new ObjectMapper();
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.ok().body(customStr);

			} else {
				ObjectMapper obj = new ObjectMapper();
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString("No id entered");
				return ResponseEntity.badRequest().body(customStr);
			}
		} catch (Exception e) {
			jsonobjectFormat = new JsonObjectFormat("Unable to delete data", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.internalServerError().body(customStr);
		}
	}
}
