package com.tablabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tablabs.model.Tdoi_outward_entity;
import com.tablabs.repository.OutwardRepository;

@Service
public class OutwardService {

	@Autowired
	OutwardRepository outwardRepository;

	public Tdoi_outward_entity getOutwardEntry(String id) {
		return outwardRepository.findById(Long.parseLong(id)).get();
	}

	public void addOutwardEntry(Tdoi_outward_entity OutwardEntry) {
		outwardRepository.save(OutwardEntry);
	}

	public void updateOutwardEntry(Tdoi_outward_entity OutwardEntry) {
		outwardRepository.save(OutwardEntry);
	}

	public void deleteOutwardEntry(String id) {
		outwardRepository.deleteById(Long.parseLong(id));
	}
}
