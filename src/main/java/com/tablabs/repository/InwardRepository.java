package com.tablabs.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tablabs.model.Inward_Entry;

@Repository
public interface InwardRepository extends CrudRepository<Inward_Entry, Long> {
	public List<Inward_Entry> findByInward_dt(Date inwardDate);

	public List<Inward_Entry> findByLetter_type(String letter_type);

	public List<Inward_Entry> findByFrom_where_details(String from_where_details);

	@Query("select * from Inward_Entry i where i.inward_dt=?1 and i.letter_type=?2")
	public List<Inward_Entry> findByInward_dtAndLetter_type(Date inwardDate, String letterType);

	@Query("select * from Inward_Entry i where i.inward_dt=?1 and i.from_where_details=?2")
	public List<Inward_Entry> findByInward_dtAndFrom_where_details(Date inwardDate, String fromWhereDetails);

	@Query("select * from Inward_Entry i where i.letter_type=?1 and i.from_where_details=?2")
	public List<Inward_Entry> findByLetter_typeAndFrom_where_details(String letterType, String fromWhereDetails);

}
