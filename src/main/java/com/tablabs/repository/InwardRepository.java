package com.tablabs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tablabs.model.Inward_Entry;

@Repository
public interface InwardRepository extends CrudRepository<Inward_Entry, Long> {

}
