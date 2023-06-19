package com.service;

import java.util.List;

import com.model.Spettacolo;

public interface ISpettacoloService {
	
	//get all
	List<Spettacolo> getAllSpettacoli();
	
	//get by cod Spettacolo
	Spettacolo getSpettacoloBycodSpettacolo(String cod_spettacolo);
	
	//exists
	boolean existsSpettacolo(String cod_spettacolo);
	

}
