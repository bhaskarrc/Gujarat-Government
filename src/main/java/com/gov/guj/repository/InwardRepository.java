package com.gov.guj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gov.guj.model.Tdoi_inward_entry;

@Repository
public interface InwardRepository
		extends CrudRepository<Tdoi_inward_entry, Long>, JpaSpecificationExecutor<Tdoi_inward_entry> {

	@Query(value = "SELECT max(inward_no) FROM Tdoi_inward_entry")
	public Long getMaxInwardNumber();
}