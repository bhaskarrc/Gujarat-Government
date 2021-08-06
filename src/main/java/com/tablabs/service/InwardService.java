package com.tablabs.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.tablabs.DTO.Inward_Entry_DTO;
import com.tablabs.model.Inward_Entry;
import com.tablabs.repository.InwardRepository;

public class InwardService {
	@Autowired
	InwardRepository inwardRepository;

	public Inward_Entry getInwardEntryByFields(Inward_Entry_DTO inwardDto) {

	}

	public Inward_Entry getInwardEntryByDate() {
	}

	public Inward_Entry getInwardEntryByLettertype() {

	}

	public Inward_Entry getInwardEntryByInwardDateAndLettertype() {

	}

	public Inward_Entry getInwardEntryByInwardDateAndFromWhereDetails() {

	}
	
	public Inward_Entry getInwardEntryByLetterTypeAndFromWhereDetails() {
		
	}
	

	public Inward_Entry getInwardEntry(String id) {
		return inwardRepository.findById(Long.parseLong(id)).get();
	}

	public void addInwardEntry(Inward_Entry inwardEntry) {
		inwardRepository.save(inwardEntry);
	}

	public void updateInwardEntry(Inward_Entry inwardEntry) {
		inwardRepository.save(inwardEntry);
	}

	public void deleteInwardEntry(String id) {
		inwardRepository.deleteById(Long.parseLong(id));
	}
}
