package com.tablabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tablabs.model.Tdoi_outward_entry;
import com.tablabs.repository.OutwardRepository;

@Service
public class OutwardService {

	@Autowired
	OutwardRepository outwardRepository;

	public Tdoi_outward_entry getOutwardEntry(String id) {
		return outwardRepository.findById(Long.parseLong(id)).get();
	}

	public void addOutwardEntry(Tdoi_outward_entry OutwardEntry) {
		outwardRepository.save(OutwardEntry);
	}

	public void updateOutwardEntry(Tdoi_outward_entry OutwardEntry) {
		outwardRepository.save(OutwardEntry);
	}

	public void deleteOutwardEntry(String id) {
		outwardRepository.deleteById(Long.parseLong(id));
	}
}
