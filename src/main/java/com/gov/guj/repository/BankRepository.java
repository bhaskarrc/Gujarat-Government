package com.gov.guj.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gov.guj.model.Ms_bank;

@Repository
public interface BankRepository extends CrudRepository<Ms_bank, Long> {
}