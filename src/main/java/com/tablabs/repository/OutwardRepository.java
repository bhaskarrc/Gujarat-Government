package com.tablabs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tablabs.model.Outward_Entry;

@Repository
public interface OutwardRepository extends CrudRepository<Outward_Entry, Long>{

}
