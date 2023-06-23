package com.service;

import java.util.List;

import com.model.Volo;

public interface IVoloService {
	
	//get All
	List<Volo> getAllVoli();
	
	//Volo by ID
	Volo getVoloByID(int id);
	
	//exists by ID
	boolean existsVoloByID(int id);
	
	//update volo
	boolean updateVolo(Volo vl);

}
