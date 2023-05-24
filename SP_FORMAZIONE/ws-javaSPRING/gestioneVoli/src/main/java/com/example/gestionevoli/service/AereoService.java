package com.example.gestionevoli.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestionevoli.entity.Aereo;
import com.example.gestionevoli.repository.AereoRepository;

@Service
public class AereoService implements IAereoService{
	
	@Autowired
	private AereoRepository repo ;

	@Override
	public List<Aereo> getAllAereo() {
		List<Aereo> lst = new ArrayList<>();
		repo.findAll().forEach(ae->lst.add(ae));
		return lst;
	}

	@Override
	public Aereo getAereoById(String AereoId) {
		return repo.findById(AereoId).get();
	}

	@Override
	public boolean existById(String AereoId) {
		return repo.existsById(AereoId);
	}

	@Override
	public boolean addAereo(Aereo ae) {
		if(repo.existsById(ae.getIdAereo())) {
			return false;
		}else {
			repo.save(ae);
			return true;
		}
	}

	@Override
	public void updateAereo(Aereo ae) {
		repo.save(ae);
	}

	@Override
	public void deleteAereo(String AereoId) {
		repo.delete(getAereoById(AereoId));
	}

}
