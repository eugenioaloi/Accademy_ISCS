package com.example.gestionevoli.service;

import java.util.List;

import com.example.gestionevoli.entity.Aereo;

public interface IAereoService {
	
	//get All list
	public List<Aereo> getAllAereo();
	
	//getById
	public Aereo getAereoById(String AereoId);
	
	//existByID
	public boolean existById(String AereoId);
	
	//add boolean
	public boolean addAereo(Aereo ae);
	
	//update
	public void updateAereo(Aereo ae);
	
	//delete
	public void deleteAereo(String AereoId);
	

}
