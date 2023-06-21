package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.Biglietto;

public interface BigliettoRepository extends CrudRepository<Biglietto, Integer> {
	
}
