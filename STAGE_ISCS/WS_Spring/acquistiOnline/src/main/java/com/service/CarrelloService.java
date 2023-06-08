package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Carrello;
import com.repository.ICarrelloRepository;

@Service
public class CarrelloService implements ICarrelloService{
	
	@Autowired
	private ICarrelloRepository repo;

	@Override
	public List<Carrello> getAllCarrelli() {
		List <Carrello> lst= new ArrayList<>();
		
		repo.findAll().forEach(cr->lst.add(cr));
		return lst;
	}

	@Override
	public boolean existsById(int id) {
		return repo.existsById(id);
	}

	@Override
	public List<Carrello> getAllCarrelliByCodCliente(String codCliente) {
		List<Carrello> lst= new ArrayList<>();
		lst= repo.findCarrelloByCodCliente(codCliente);
		return lst;
	}
	
	
	

}
