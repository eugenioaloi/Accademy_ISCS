package com.service;

import java.util.List;

import com.model.Cliente;

public interface IClienteService {
	
	//get all
	List<Cliente> getAllClienti();
	
	//get by id
	Cliente getClienteById(int id);
	
	//exists by id
	boolean existsClienteById(int id);
	

}
