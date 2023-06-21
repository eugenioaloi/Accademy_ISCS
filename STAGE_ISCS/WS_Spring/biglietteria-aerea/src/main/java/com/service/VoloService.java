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
	public Volo getVoloById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public boolean exitsVoloById(int id) {
		return repo.existsById(id);
	}

}
