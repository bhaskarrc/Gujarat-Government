package com.tablabs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tablabs.model.OutwardEntry;

@Repository
public interface OutwardRepository extends CrudRepository<OutwardEntry, Long>{

}
