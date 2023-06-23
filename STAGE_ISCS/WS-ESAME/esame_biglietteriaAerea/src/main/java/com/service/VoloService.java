package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Volo;
import com.repository.VoloRepository;

@Service
public class VoloService implements IVoloService {

	@Autowired
	private VoloRepository repo;
	
	@Override
	public List<Volo> getAllVoli() {
		List<Volo> lst = new ArrayList<>();
		repo.findAll().forEach(vl->lst.add(vl));
		return lst;
	}

	@Override
	public Volo getVoloByID(int id) {
		return repo.findById(id).get();
	}

	@Override
	public boolean existsVoloByID(int id) {
		return repo.existsById(id);
	}

	@Override
	public boolean updateVolo(Volo vl) {
		//controllo se il volo esiste, altrimenti nulla da aggiornare
		boolean flag = repo.existsById(vl.getId());
		if(!flag) {//se false non si procede
			return false;
		}
		repo.save(vl);
		return true;
	}

}
