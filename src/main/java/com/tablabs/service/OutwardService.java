package com.tablabs.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tablabs.model.OutwardEntry;
import com.tablabs.repository.OutwardRepository;

public class OutwardService {
	@Autowired
	OutwardRepository outwardRepository;

	public OutwardEntry getOutwardEntry(String id) {
		return outwardRepository.findById(Long.parseLong(id)).get();
	}

	public void addOutwardEntry(OutwardEntry OutwardEntry) {
		outwardRepository.save(OutwardEntry);
	}

	public void updateOutwardEntry(OutwardEntry OutwardEntry) {
		outwardRepository.save(OutwardEntry);
	}

	public void deleteOutwardEntry(String id) {
		outwardRepository.deleteById(Long.parseLong(id));
	}
}
