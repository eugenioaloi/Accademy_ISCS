package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.Spettacolo;

public interface SpettacoloRepository extends CrudRepository<Spettacolo, Integer> {
	
	Spettacolo findByCodspettacolo(String cod_spettacolo);
	boolean existsByCodspettacolo (String cod_spettacolo);

}
