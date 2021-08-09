package com.tablabs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tablabs.model.Tdoi_outward_entity;

@Repository
public interface OutwardRepository extends CrudRepository<Tdoi_outward_entity, Long>{

}
