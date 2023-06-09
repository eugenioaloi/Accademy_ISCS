package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.model.Magazzino;
import com.repository.IMagazzinoRepository;

@Service
public class MagazzinoService implements IMagazzinoService {
	
	@Autowired
	private IMagazzinoRepository repo;

	@Override
	public List<Magazzino> getAllMagazzini() {
		List <Magazzino> lst=new ArrayList<>();
		repo.findAll().forEach(mz->lst.add(mz));
		return lst;
	}

	@Override
	public Magazzino getMagazzinoById(String id_magazzino) {
		return repo.findByidMagazzino(id_magazzino);
	}

	@Override
	public boolean existByIdMagazzino(String id_magazzino) {
            boolean exists = false;
        
        if(repo.findByidMagazzino(id_magazzino) == null) {
        	exists = false;
        
        } else {
       exists = true;
        }
		return exists;
		
	}

	@Override
	public Magazzino getMagazzinoByCodArticolo(String codArticolo) {
 
		Magazzino magazzini= new Magazzino();
		magazzini= repo.findBycodarticolo(codArticolo);
		return magazzini;
	}

	
	
	
	
	
	

}