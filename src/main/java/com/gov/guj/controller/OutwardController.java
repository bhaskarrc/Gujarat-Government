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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.gov.guj.DTO.OutwardEntryDTO;
import com.gov.guj.DTO.OutwardListingResponseDTO;
import com.gov.guj.DTO.OutwardUpdateEntryDTO;
import com.gov.guj.model.JsonObjectFormat;
import com.gov.guj.model.Tdoi_outward_entry;
import com.gov.guj.service.OutwardService;

@RestController()
@RequestMapping("DOI/outward")
@CrossOrigin()
public class OutwardController {

	@Autowired
	OutwardService service;

	@PostMapping("/save")
	public ResponseEntity<String> submitEntry(@RequestBody List<OutwardEntryDTO> outwardEntryDTO)
			throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (outwardEntryDTO != null && !outwardEntryDTO.isEmpty()) {
				List<Tdoi_outward_entry> outward = this.service.addOutwardEntry(outwardEntryDTO);
				jsonobjectFormat = new JsonObjectFormat("Data Save successfully", true, outward);
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				ObjectMapper obj = new ObjectMapper();
				obj.registerModule(new JavaTimeModule());
				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				obj.setDateFormat(df);
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.ok().body(customStr);

			} else {
				jsonobjectFormat = new JsonObjectFormat("No data entered ", false, "");
				ObjectMapper obj = new ObjectMapper();
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.ok().body(customStr);
			}

		} catch (Exception e) {
			jsonobjectFormat = new JsonObjectFormat("Unable to save Data! ", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.internalServerError().body(customStr);
		}
	}

	@PostMapping("/get")
	public ResponseEntity<String> getUser(@RequestBody Map<String, String> outwardEntry)
			throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (outwardEntry.isEmpty()) {
				List<OutwardListingResponseDTO> outwardListingResponseList = this.service.getAll();
				jsonobjectFormat = new JsonObjectFormat("Data fetch succesfully! ", true, outwardListingResponseList);
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				ObjectMapper obj = new ObjectMapper();
				obj.registerModule(new JavaTimeModule());
				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				obj.setDateFormat(df);
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.ok().body(customStr);

			} else {
				List<OutwardListingResponseDTO> outwardListingResponseList = this.service
						.getoutwardEntryByFieldName(outwardEntry);
				jsonobjectFormat = new JsonObjectFormat("Data fetch succesfully! ", true, outwardListingResponseList);
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				ObjectMapper obj = new ObjectMapper();
				obj.registerModule(new JavaTimeModule());
				obj.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				obj.setDateFormat(df);
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.ok().body(customStr);
			}
		} catch (Exception e) {
			jsonobjectFormat = new JsonObjectFormat("Unable to fetch Data! ", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.ok().body(customStr);
		}
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<String> getUser(@PathVariable Long id) throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (id != null) {
				Tdoi_outward_entry updateResponse = this.service.getOutwardEntryById(id);
				jsonobjectFormat = new JsonObjectFormat("Data fetched for the id: " + id, true, updateResponse);
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
			jsonobjectFormat = new JsonObjectFormat("Unable to fetch Data!", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.internalServerError().body(customStr);
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateEntry(@RequestBody OutwardUpdateEntryDTO outwardUpdateEntryDTO,
			@PathVariable Long id) throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (id != null) {
				Tdoi_outward_entry updateResponse = this.service.updateOutwardEntry(outwardUpdateEntryDTO, id);
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
			jsonobjectFormat = new JsonObjectFormat("Unable to update Data! ", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.ok().body(customStr);
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEntry(@PathVariable Long id) throws JsonProcessingException {

		JsonObjectFormat jsonobjectFormat;

		try {
			if (id != null) {
				Tdoi_outward_entry tdoi_outward_entry = this.service.deleteOutwardEntry(id);
				jsonobjectFormat = new JsonObjectFormat("Data deleted for the id: " + id, true, tdoi_outward_entry);
				ObjectMapper obj = new ObjectMapper();
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
				return ResponseEntity.ok().body(customStr);
			} else {
				ObjectMapper obj = new ObjectMapper();
				String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString("No id entered");
				return ResponseEntity.badRequest().body(customStr);
			}
		} catch (Exception e) {
			jsonobjectFormat = new JsonObjectFormat("Unable to delete data! ", false, "");
			ObjectMapper obj = new ObjectMapper();
			String customStr = obj.writerWithDefaultPrettyPrinter().writeValueAsString(jsonobjectFormat);
			return ResponseEntity.internalServerError().body(customStr);
		}
	}
}
