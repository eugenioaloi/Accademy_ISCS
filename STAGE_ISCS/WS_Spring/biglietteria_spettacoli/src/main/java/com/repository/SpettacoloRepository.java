package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.Spettacolo;

public interface SpettacoloRepository extends CrudRepository<Spettacolo, Integer> {
	
	Spettacolo findByBigliettoid(int biglietto_id);

}
