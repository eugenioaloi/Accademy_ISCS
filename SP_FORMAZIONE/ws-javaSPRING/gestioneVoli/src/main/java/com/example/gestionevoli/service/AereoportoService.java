package com.example.gestionevoli.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestionevoli.entity.Aereoporto;
import com.example.gestionevoli.repository.AereoportoRepository;

public class AereoportoService implements IAereoportoService{
	
	@Autowired
	private AereoportoRepository repo;

	@Override
	public List<Aereoporto> getAllAereoporto() {
		List<Aereoporto> lst = new ArrayList<>();
		repo.findAll().forEach(a->lst.add(a));
		return lst;
	}

	@Override
	public boolean existById(String id) {
		return repo.existsById(id);
	}

	@Override
	public Aereoporto getById(String id) {
		return repo.findById(id).get();
	}

	@Override
	public boolean addAereoporto(Aereoporto ap) {
		if(repo.existsById(ap.getIdAereoporto())) {
			return false;
		}else {
			repo.save(ap);
			return true;
		}
	}

	@Override
	public void updateAereoporto(Aereoporto ap) {
		repo.save(ap);
	}

	@Override
	public void deleteAereoporto(String id) {
		repo.delete(getById(id));
	}

}
