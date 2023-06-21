package com.service;

import java.util.List;

import com.model.Volo;

public interface IVoloService {
	
	//get all voli
	List<Volo> getAllVoli();
	
	// Volo by id
	Volo getVoloById (int id);
	
	// exits Volo by id
	boolean exitsVoloById(int id);

}
