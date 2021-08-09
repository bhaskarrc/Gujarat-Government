package com.tablabs.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.tablabs.DTO.InwardEntryDTO;
import com.tablabs.model.InwardEntry;
import com.tablabs.repository.InwardRepository;

public class InwardService {

	private InwardRepository inwardRepository;
	private ModelMapper mapper;

	@Autowired
	public InwardService(InwardRepository inwardRepository, ModelMapper mapper) {
		this.inwardRepository = inwardRepository;
		this.mapper = mapper;
	}

	public List<InwardEntryDTO> getByFieldName(Map<String, String> inwardEntry) {

		String query = "SELECT i FROM InwardEntry i WHERE date_type= " + inwardEntry.get("dateType");

		for (Map.Entry<String, String> entry : inwardEntry.entrySet()) {

			if (entry.getValue() != null) {
				query += (entry.getKey().equals("fromDate") || entry.getKey().equals("endDate"))
						? "AND " + entry.getValue() + " = " + java.sql.Date.valueOf(LocalDate.parse(entry.getValue()))
						: "AND " + entry.getKey() + " = " + entry.getValue();
			} else {
				query += "SELECT i FROM InwardEntry i";
				break;
			}
		}

		List<InwardEntry> fetchedInwardEntry = inwardRepository.findByFieldName(query);

		List<InwardEntryDTO> inwardDtoList = fetchedInwardEntry.stream().map(d -> this.convertEntityToDto(d))
				.collect(Collectors.toCollection(ArrayList::new));

		return inwardDtoList;
	}

	public void addInwardEntry(List<InwardEntryDTO> inwardEntryDto) {
		inwardEntryDto.forEach(d -> {
			inwardRepository.save(this.convertDtoToEntity(d));
		});
	}

	public void updateInwardEntry(InwardEntry inwardEntry) {
		inwardRepository.save(inwardEntry);
	}

	public void deleteInwardEntry(String id) {
		inwardRepository.deleteById(Long.parseLong(id));
	}

	InwardEntryDTO convertEntityToDto(InwardEntry inwardEntry) {
		InwardEntryDTO inwardEntryDTO = mapper.map(inwardEntry, InwardEntryDTO.class);
		return inwardEntryDTO;
	}

	InwardEntry convertDtoToEntity(InwardEntryDTO inwardEntryDto) {
		InwardEntry inwardEntry = mapper.map(inwardEntryDto, InwardEntry.class);
		return inwardEntry;
	}
}
