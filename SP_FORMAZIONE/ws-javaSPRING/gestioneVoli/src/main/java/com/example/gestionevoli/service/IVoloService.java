package com.example.gestionevoli.service;

import java.util.List;

import com.example.gestionevoli.entity.Company;
import com.example.gestionevoli.entity.Volo;

public interface IVoloService {
	
	List<Volo> getAllVoli();
	
	boolean existsById(String voloID);
	
	Volo getVoloById(String voloID);
	
	boolean addVolo(Volo volo);
	
	void updateVolo(Volo volo);
	
	void deleteVolo(String voloID);

}
