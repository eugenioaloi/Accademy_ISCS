package com.service;

import java.util.List;

import com.model.Spettacolo;

public interface ISpettacoloService {
	
	//get all
	List<Spettacolo> getAllSpettacoli();
	
	//get Spettacolo by id
	Spettacolo getSpettacoloById(int id);
	
	//get Spettacolo by id_biglietto
	Spettacolo getSpettacoloByIdBiglietto(int id);
	
	//exists
	boolean existsSpettacolo(int id);
	

}
