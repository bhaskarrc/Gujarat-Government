package com.tablabs.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tablabs.DTO.InwardEntryDTO;
import com.tablabs.model.Tdoi_inward_entry;
import com.tablabs.repository.InwardRepository;

@Service
public class InwardService {

	private InwardRepository inwardRepository;
	private ModelMapper mapper;

	@Autowired
	public InwardService(InwardRepository inwardRepository, ModelMapper mapper) {
		this.inwardRepository = inwardRepository;
		this.mapper = mapper;
	}

	public List<InwardEntryDTO> getByFieldName(Map<String, String> inwardEntry) {

		String query = "SELECT * FROM TDOI_INWARD_ENTRY";

		if (!inwardEntry.get("dateType").isEmpty()) {
			query = "SELECT * FROM TDOI_INWARD_ENTRY WHERE date_type= " + inwardEntry.get("dateType");
			if (inwardEntry.isEmpty()) {
				query = "SELECT * FROM TDOI_INWARD_ENTRY";
				System.out.println(inwardRepository.findByFieldName(query));
			} else {
				for (Map.Entry<String, String> entry : inwardEntry.entrySet()) {
					if (entry.getValue() != null) {
						query += (entry.getKey().equals("fromDate") || entry.getKey().equals("endDate"))
								? "AND " + entry.getValue() + " = "
										+ java.sql.Date.valueOf(LocalDate.parse(entry.getValue()))
								: "AND " + entry.getKey() + " = " + entry.getValue();
						System.out.println(inwardRepository.findByFieldName(query));

					}
				}
			}

		}

		List<Tdoi_inward_entry> fetchedInwardEntry = inwardRepository.findByFieldName(query);

		if (fetchedInwardEntry == null) {
			System.out.println("********************************************Null returned");
		}

		List<InwardEntryDTO> inwardDtoList = fetchedInwardEntry.stream().map(d -> this.convertEntityToDto(d))
				.collect(Collectors.toCollection(ArrayList::new));

		return inwardDtoList;
	}

	public void addInwardEntry(List<InwardEntryDTO> inwardEntryDto) {
		inwardEntryDto.forEach(d -> {
			inwardRepository.save(this.convertDtoToEntity(d));
		});
	}

//	public void updateInwardEntry(InwardEntry inwardEntry) {
//		inwardRepository.save(inwardEntry);
//	}

	public void deleteInwardEntry(String id) {
		inwardRepository.deleteById(Long.parseLong(id));
	}

	InwardEntryDTO convertEntityToDto(Tdoi_inward_entry inwardEntry) {
		InwardEntryDTO inwardEntryDTO = mapper.map(inwardEntry, InwardEntryDTO.class);
		return inwardEntryDTO;
	}

	Tdoi_inward_entry convertDtoToEntity(InwardEntryDTO inwardEntryDto) {
		Tdoi_inward_entry inwardEntry = mapper.map(inwardEntryDto, Tdoi_inward_entry.class);
		return inwardEntry;
	}
}
