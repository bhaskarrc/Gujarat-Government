package com.tablabs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tablabs.DTO.InwardEntryDTO;
import com.tablabs.DTO.InwardListingResponseDTO;
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

	public Tdoi_inward_entry getInwardEntryById(long id) {
		return inwardRepository.findById(id).get();
	}

	public List<InwardListingResponseDTO> getAll() {
		List<InwardListingResponseDTO> inwardListingResponseDTO = new ArrayList<>();
		inwardRepository.findAll().forEach(r -> {
			inwardListingResponseDTO.add(this.convertEntityToResponseDto(r));
		});
		return inwardListingResponseDTO;
	}

	public List<InwardListingResponseDTO> getInwardEntryByFieldName(Map<String, String> inwardEntry) {

		String query = "SELECT * FROM TDOI_INWARD_ENTRY i WHERE ";

		if (!inwardEntry.containsKey("date_type") || inwardEntry.get("date_type").equals("Inward Date")) {
			if (inwardEntry.containsKey("from_dt") && inwardEntry.containsKey("end_dt")) {
				query += "i.INWARD_DT BETWEEN " + inwardEntry.get("from_dt AND ") + inwardEntry.get("end_dt");
				inwardEntry.remove("from_dt");
				inwardEntry.remove("end_dt");
			} else if (inwardEntry.containsKey("from_dt")) {
				query += "i.INWARD_DT = " + inwardEntry.get("from_dt");
				inwardEntry.remove("from_dt");
			} else if (inwardEntry.containsKey("end_dt")) {
				query += "i.INWARD_DT = " + inwardEntry.get("end_dt");
				inwardEntry.remove("end_dt");
			}

			for (Map.Entry<String, String> entry : inwardEntry.entrySet()) {
				query += " And " + entry.getKey() + " = " + entry.getValue();
			}

		} else {
			if (inwardEntry.containsKey("from_dt") && inwardEntry.containsKey("end_dt")) {
				query += "i.LETTER_DT BETWEEN " + inwardEntry.get("from_dt AND ") + inwardEntry.get("end_dt");
				inwardEntry.remove("from_dt");
				inwardEntry.remove("end_dt");
			} else if (inwardEntry.containsKey("from_dt")) {
				query += "i.LETTER_DT = " + inwardEntry.get("from_dt");
				inwardEntry.remove("from_dt");
			} else if (inwardEntry.containsKey("end_dt")) {
				query += "i.LETTER_DT = " + inwardEntry.get("end_dt");
				inwardEntry.remove("end_dt");
			}

			for (Map.Entry<String, String> entry : inwardEntry.entrySet()) {
				query += " AND " + entry.getKey() + " = " + entry.getValue();
			}
		}

		query += ";";
		
		System.out.println(query);

		List<Tdoi_inward_entry> fetchedInwardEntry = inwardRepository.findByFieldName(query);

		List<InwardListingResponseDTO> inwardDtoList = fetchedInwardEntry.stream()
				.map(d -> this.convertEntityToResponseDto(d)).collect(Collectors.toCollection(ArrayList::new));

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

	InwardListingResponseDTO convertEntityToResponseDto(Tdoi_inward_entry inwardEntry) {
		InwardListingResponseDTO inwardEntryResponseDTO = mapper.map(inwardEntry, InwardListingResponseDTO.class);
		return inwardEntryResponseDTO;
	}

	Tdoi_inward_entry convertDtoToEntity(InwardEntryDTO inwardEntryDto) {
		Tdoi_inward_entry inwardEntry = mapper.map(inwardEntryDto, Tdoi_inward_entry.class);
		return inwardEntry;
	}

}
