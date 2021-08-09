package com.tablabs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tablabs.model.Tdoi_inward_entry;

@Repository
public interface InwardRepository extends CrudRepository<Tdoi_inward_entry, Long> {

	@Query(value = "fields", nativeQuery = true)
	public List<Tdoi_inward_entry> findByFieldName(String fields);

}
