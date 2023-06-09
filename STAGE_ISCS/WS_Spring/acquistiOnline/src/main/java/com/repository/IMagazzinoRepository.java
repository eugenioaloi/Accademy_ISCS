package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.Magazzino;

public interface IMagazzinoRepository  extends CrudRepository<Magazzino, Integer> {
	
	Magazzino findByIdmagazzino(String id_magazzino);
	
	boolean existsByIdmagazzino(String id_magazzino);
	
	Magazzino findByCodarticolo(String cod_articolo);

}
