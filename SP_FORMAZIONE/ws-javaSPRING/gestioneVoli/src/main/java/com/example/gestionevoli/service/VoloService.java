package com.example.gestionevoli.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestionevoli.entity.Company;
import com.example.gestionevoli.entity.Volo;
import com.example.gestionevoli.repository.VoloRepository;

@Service
public class VoloService implements IVoloService{
	
	@Autowired
	private VoloRepository volorepository;

	@Override
	public List<Volo> getAllVoli() {
		List<Volo> lst = new ArrayList<>();
		volorepository.findAll().forEach(v->lst.add(v));
		return lst;
	}

	@Override
	public boolean existsById(String voloID) {
		return volorepository.existsById(voloID);
	}

	@Override
	public Volo getVoloById(String voloID) {
		return volorepository.findById(voloID).get();
	}

	@Override
	public boolean addVolo(Volo volo) {
		if(volorepository.existsById(volo.getIdVolo())) {
			return false;
		}else {
			volorepository.save(volo);
			return true;
		}
	}

	@Override
	public void updateVolo(Volo volo) {
		volorepository.save(volo);
	}

	@Override
	public void deleteVolo(String voloID) {
		volorepository.delete(getVoloById(voloID));
	}

}
