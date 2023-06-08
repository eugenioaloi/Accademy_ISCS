package com.service;

import java.util.List;

import com.model.Carrello;

public interface ICarrelloService {
	
	//getAll
	public List<Carrello> getAllCarrelli();
	
	//existById
	public boolean existsById(int id);
	
	//GetAllCarrelliByCodCliente
	public List <Carrello> getAllCarrelliByCodCliente(String codCliente);
	
	//add
	public boolean addCarrello(Carrello cr);
	
	//update
	public boolean updateCarrello(Carrello cr);
	
	//qtDisponibili
	public int getQtDisponibili(String cod_articolo);

}
