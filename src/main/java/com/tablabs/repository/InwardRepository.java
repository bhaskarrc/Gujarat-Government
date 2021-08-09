package com.tablabs.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tablabs.model.InwardEntry;

@Repository
public interface InwardRepository extends CrudRepository<InwardEntry, Long> {

	@Query("fields")
	public List<InwardEntry> findByFieldName(String fields);

}
