package com.gov.guj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gov.guj.model.Tdoi_outward_entry;

@Repository
public interface OutwardRepository extends CrudRepository<Tdoi_outward_entry, Long> {

	@Query(value = "fields", nativeQuery = true)
	public List<Tdoi_outward_entry> findByFieldName(String fields);

}
