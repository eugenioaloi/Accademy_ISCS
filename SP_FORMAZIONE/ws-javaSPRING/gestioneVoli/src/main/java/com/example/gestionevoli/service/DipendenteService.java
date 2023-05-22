package com.example.gestionevoli.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestionevoli.entity.Dipendente;
import com.example.gestionevoli.repository.DipendenteRepository;

public class DipendenteService implements IDipendenteService {
	
	@Autowired
	private DipendenteRepository repo;

	@Override
	public List<Dipendente> getAllDipendente() {
		List<Dipendente> lst = new ArrayList<>();
		repo.findAll().forEach(dip->lst.add(dip));
		return lst;
	}

	@Override
	public boolean existById(String dipendenteId) {
		return repo.existsById(dipendenteId);
	}

	@Override
	public Dipendente getDipendenteById(String dipendenteId) {
		return repo.findById(dipendenteId).get();
	}

	@Override
	public boolean addDipendente(Dipendente dip) {
		if(existById(dip.getMatricola())) {
			return false;
		}else {
			repo.save(dip);
			return true;
		}
	}

	@Override
	public void updateDipendente(Dipendente dip) {
		repo.save(dip);
	}

	@Override
	public void deleteDipendente(String dipendenteId) {
		repo.delete(getDipendenteById(dipendenteId));
	}

}
