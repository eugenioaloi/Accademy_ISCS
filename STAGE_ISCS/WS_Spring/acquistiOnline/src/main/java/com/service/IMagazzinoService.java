package com.service;

import java.util.List;

import com.model.Magazzino;

public interface IMagazzinoService {
	
	//get All
	public List<Magazzino> getAllMagazzini();
	
	//get by ID
	public Magazzino getMagazzinoById(String id_magazzino);
	
	//exist by ID
	public boolean existByIdMagazzino(String id_magazzino);
	
	//getMagazzino by cod_articolo
	public Magazzino getMagazzinoByCodArticolo(String cod_articolo);

}
