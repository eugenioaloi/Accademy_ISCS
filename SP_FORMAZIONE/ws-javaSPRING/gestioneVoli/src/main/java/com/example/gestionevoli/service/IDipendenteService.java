package com.example.gestionevoli.service;

import java.util.List;

import com.example.gestionevoli.entity.Dipendente;

public interface IDipendenteService {
	
	//get all-list
	public List<Dipendente> getAllDipendente();
	
	//existby id - boolean
	public boolean existById(String dipendenteId);
	
	//getById - Dipendente
	public Dipendente getDipendenteById(String dipendenteId);
	
	//add - boolean
	public boolean addDipendente(Dipendente dip);
	
	//update
	public void updateDipendente(Dipendente dip);
	
	//delete
	public void deleteDipendente(String dipendenteId);
	
}
