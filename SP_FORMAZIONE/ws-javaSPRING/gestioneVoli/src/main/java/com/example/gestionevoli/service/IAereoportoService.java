package com.example.gestionevoli.service;

import java.util.List;

import com.example.gestionevoli.entity.Aereoporto;

public interface IAereoportoService {
	
	//getAll List
	public List<Aereoporto> getAllAereoporto();
	
	//existByID boolean
	public boolean existById(String id);
	
	//getbyID <T>
	public Aereoporto getAereoportoById(String id);
	
	//add boolean
	public boolean addAereoporto (Aereoporto ap);
	
	//update void
	public void updateAereoporto (Aereoporto ap);
	
	//delete void
	public void deleteAereoporto(String id);

}
