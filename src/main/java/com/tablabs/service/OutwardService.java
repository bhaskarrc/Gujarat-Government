package com.tablabs.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tablabs.model.Outward_Entry;
import com.tablabs.repository.OutwardRepository;

public class OutwardService {
	@Autowired
	OutwardRepository outwardRepository;

	public Outward_Entry getOutwardEntry(String id) {
		return outwardRepository.findById(Long.parseLong(id)).get();
	}

	public void addOutwardEntry(Outward_Entry OutwardEntry) {
		outwardRepository.save(OutwardEntry);
	}

	public void updateOutwardEntry(Outward_Entry OutwardEntry) {
		outwardRepository.save(OutwardEntry);
	}

	public void deleteOutwardEntry(String id) {
		outwardRepository.deleteById(Long.parseLong(id));
	}
}
