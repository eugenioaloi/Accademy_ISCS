package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Spettacolo;
import com.repository.SpettacoloRepository;

@Service
public class SpettacoloService implements ISpettacoloService {
	
	@Autowired
	private SpettacoloRepository repo;

	@Override
	public List<Spettacolo> getAllSpettacoli() {
		List<Spettacolo> lst = new ArrayList<>();
		repo.findAll().forEach(sp->lst.add(sp));
		return lst;
	}

	@Override
	public Spettacolo getSpettacoloById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Spettacolo getSpettacoloByIdBiglietto(int id) {
		return repo.findByBigliettoid(id);
	}

	@Override
	public boolean existsSpettacolo(int id) {
		return repo.existsById(id);
	}
	
}
