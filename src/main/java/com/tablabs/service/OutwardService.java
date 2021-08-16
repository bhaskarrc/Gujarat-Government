package com.tablabs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tablabs.DTO.OutwardEntryDTO;
import com.tablabs.DTO.OutwardListingResponseDTO;
import com.tablabs.model.Tdoi_outward_entry;
import com.tablabs.repository.OutwardRepository;

@Service
@Transactional
public class OutwardService {

	private ModelMapper mapper;
	private OutwardRepository outwardRepository;

	@Autowired
	public OutwardService(OutwardRepository outwardRepository, ModelMapper mapper) {

		this.outwardRepository = outwardRepository;
		this.mapper = mapper;
	}

	public Tdoi_outward_entry getOutwardEntryById(long id) {
		return outwardRepository.findById(id).get();
	}

	public List<OutwardListingResponseDTO> getAll() {
		List<OutwardListingResponseDTO> outwardListingResponseDTO = new ArrayList<>();
		outwardRepository.findAll().forEach(r -> {
			outwardListingResponseDTO.add(this.convertEntityToResponseDto(r));
		});
		return outwardListingResponseDTO;
	}

	public List<OutwardListingResponseDTO> getoutwardEntryByFieldName(Map<String, String> outwardEntry) {

		String query = "SELECT FROM DOI.TDOI_OUTWARD_ENTRY o ";

		for (Map.Entry<String, String> entry : outwardEntry.entrySet()) {
			query += (query.contains("WHERE"))
					? " AND o." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
					: " WHERE o." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
		}

		System.out.println(query);

		List<Tdoi_outward_entry> fetchedOutwardEntry = outwardRepository.findByFieldName(query);

		List<OutwardListingResponseDTO> outwardDtoList = fetchedOutwardEntry.stream()
				.map(d -> this.convertEntityToResponseDto(d)).collect(Collectors.toCollection(ArrayList::new));

		return outwardDtoList;
	}

	public void addOutwardEntry(List<OutwardEntryDTO> outwardEntryDto) {
		outwardEntryDto.forEach(d -> {
			System.out.println(this.convertDtoToEntity(d));
			outwardRepository.save(this.convertDtoToEntity(d));
		});
	}

	public void updateOutwardEntry(OutwardEntryDTO outwardEntryDto, long id) {
		Tdoi_outward_entry outwardEntry = this.getOutwardEntryById(id);
		outwardEntry = this.convertDtoToEntityForUpdate(outwardEntryDto, outwardEntry);
		System.out.println(outwardEntry);
		outwardRepository.save(outwardEntry); ////
	}

	public void deleteOutwardEntry(long id) {
		outwardRepository.deleteById(id);
	}

	Tdoi_outward_entry convertDtoToEntityForUpdate(OutwardEntryDTO outwardEntryDto,
			Tdoi_outward_entry todiOutwardEntry) {
		Tdoi_outward_entry outwardEntry = mapper.map(outwardEntryDto, todiOutwardEntry.getClass());
		return outwardEntry;
	}

	OutwardEntryDTO convertEntityToDto(Tdoi_outward_entry outwardEntry) {
		OutwardEntryDTO outwardEntryDTO = mapper.map(outwardEntry, OutwardEntryDTO.class);
		return outwardEntryDTO;
	}

	OutwardListingResponseDTO convertEntityToResponseDto(Tdoi_outward_entry outwardEntry) {
		OutwardListingResponseDTO outwardEntryResponseDTO = mapper.map(outwardEntry, OutwardListingResponseDTO.class);
		return outwardEntryResponseDTO;
	}

	Tdoi_outward_entry convertDtoToEntity(OutwardEntryDTO outwardEntryDto) {
		Tdoi_outward_entry outwardEntry = mapper.map(outwardEntryDto, Tdoi_outward_entry.class);
		return outwardEntry;
	}

}
