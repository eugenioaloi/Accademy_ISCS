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
	public Spettacolo getSpettacoloBycodSpettacolo(String cod_Spettacolo) {
		return repo.findByCodspettacolo(cod_Spettacolo);
	}

	@Override
	public boolean existsSpettacolo(String cod_Spettacolo) {
		return repo.existsByCodspettacolo(cod_Spettacolo);
	}

}
