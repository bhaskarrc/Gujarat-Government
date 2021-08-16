package com.tablabs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.tablabs.DTO.InwardEntryDTO;
import com.tablabs.DTO.InwardListingResponseDTO;
import com.tablabs.DTO.InwardUpdateEntryDTO;
import com.tablabs.model.Tdoi_inward_entry;
import com.tablabs.repository.InwardRepository;

@Service
@CrossOrigin(origins = "*")
@Transactional
public class InwardService {

	private InwardRepository inwardRepository;
	private ModelMapper mapper;
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public InwardService(InwardRepository inwardRepository, ModelMapper mapper, JdbcTemplate jdbcTemplate) {
		this.inwardRepository = inwardRepository;
		this.mapper = mapper;
		this.jdbcTemplate = jdbcTemplate;
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

		String query = "SELECT * FROM DOI.TDOI_INWARD_ENTRY i ";

		String date_type = Optional.ofNullable(inwardEntry.get("date_type")).orElse("empty");

		switch (date_type) {
		case "empty":
			;
		case "Inward Date":
			inwardEntry.remove("date_type");
			if (inwardEntry.containsKey("from_dt") && inwardEntry.containsKey("end_dt")) {
				query += "WHERE i.INWARD_DT BETWEEN '" + inwardEntry.get("from_dt") + "' AND '"
						+ inwardEntry.get("end_dt") + "'";
				inwardEntry.remove("from_dt");
				inwardEntry.remove("end_dt");
			} else if (inwardEntry.containsKey("from_dt")) {
				query += "WHERE i.INWARD_DT = '" + inwardEntry.get("from_dt") + "'";
				inwardEntry.remove("from_dt");
			} else if (inwardEntry.containsKey("end_dt")) {
				query += "WHERE i.INWARD_DT = '" + inwardEntry.get("end_dt") + "'";
				inwardEntry.remove("end_dt");
			}

			for (Map.Entry<String, String> entry : inwardEntry.entrySet()) {
				query += (query.contains("WHERE"))
						? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
						: "WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
			}

			break;

		case "Letter Date":
			inwardEntry.remove("date_type");
			if (inwardEntry.containsKey("from_dt") && inwardEntry.containsKey("end_dt")) {
				query += "WHERE i.LETTER_DT BETWEEN '" + inwardEntry.get("from_dt") + "' AND '"
						+ inwardEntry.get("end_dt") + "'";
				inwardEntry.remove("from_dt");
				inwardEntry.remove("end_dt");
			} else if (inwardEntry.containsKey("from_dt")) {
				inwardEntry.remove("date_type");
				query += "WHERE i.LETTER_DT = '" + inwardEntry.get("from_dt") + "'";
				inwardEntry.remove("from_dt");
			} else if (inwardEntry.containsKey("end_dt")) {
				inwardEntry.remove("date_type");
				query += "WHERE i.LETTER_DT = '" + inwardEntry.get("end_dt") + "'";
				inwardEntry.remove("end_dt");
			}

			for (Map.Entry<String, String> entry : inwardEntry.entrySet()) {
				query += (query.contains("WHERE"))
						? " AND i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'"
						: " WHERE i." + entry.getKey().toUpperCase() + " = '" + entry.getValue() + "'";
			}
			break;
		}

		System.out.println(query);

		List<Tdoi_inward_entry> fetchedInwardEntry = new ArrayList<>();
		fetchedInwardEntry = jdbcTemplate.query(query,
				(rs, rowNum) -> new Tdoi_inward_entry(rs.getLong("INWARD_ID"), rs.getLong("INWARD_NO"),
						rs.getDate("INWARD_DT").toLocalDate(), rs.getLong("LETTER_TYPE_ID"),
						rs.getString("LETTER_TYPE"), rs.getString("LETTER_NO"), rs.getDate("LETTER_DT").toLocalDate(),
						rs.getString("LETTER_DETAILS"), rs.getString("FROM_WHERE_DETAILS"), rs.getLong("DOI_BRANCH_ID"),
						rs.getLong("DOI_EMPLOYEE_ID"), rs.getString("DOI_EMPLOYEE_NAME"), rs.getString("REFERENCE_NO"),
						rs.getTimestamp("REFERENCE_DT").toLocalDateTime(), rs.getShort("ACTIVE_STATUS"),
						rs.getTimestamp("CREATED_DATE").toLocalDateTime(), rs.getLong("CREATED_BY"),
						rs.getLong("CREATED_BY_POST"), rs.getTimestamp("UPDATED_DATE").toLocalDateTime(),
						rs.getLong("UPDATED_BY"), rs.getLong("UPDATED_BY_POST")));

		System.out.println(fetchedInwardEntry);

		List<InwardListingResponseDTO> inwardDtoList = fetchedInwardEntry.stream()
				.map(d -> this.convertEntityToResponseDto(d)).collect(Collectors.toCollection(ArrayList::new));

		return inwardDtoList;
	}

	public void addInwardEntry(List<InwardEntryDTO> inwardEntryDto) {
		inwardEntryDto.forEach(d -> {
			System.out.println(this.convertDtoToEntity(d));
			inwardRepository.save(this.convertDtoToEntity(d));
		});
	}

	public void updateInwardEntry(InwardUpdateEntryDTO inwardUpdateEntryDTO, long id) {
		System.out.println(inwardUpdateEntryDTO);
		Tdoi_inward_entry inwardEntry = this.getInwardEntryById(id);
		System.out.println(inwardEntry);
		inwardEntry = this.convertDtoToEntityForUpdate(inwardUpdateEntryDTO, inwardEntry);
		System.out.println(inwardEntry);
		inwardRepository.save(inwardEntry); ////
	}

	public void deleteInwardEntry(long id) {
		inwardRepository.deleteById(id);
	}

	Tdoi_inward_entry convertDtoToEntityForUpdate(InwardUpdateEntryDTO inwardUpdateEntryDTO,
			Tdoi_inward_entry todiInwardEntry) {
		Tdoi_inward_entry inwardEntry = mapper.map(inwardUpdateEntryDTO, todiInwardEntry.getClass());
		return inwardEntry;
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
