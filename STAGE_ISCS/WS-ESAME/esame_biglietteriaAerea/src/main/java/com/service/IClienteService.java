package com.service;

import java.util.List;

import com.model.Cliente;

public interface IClienteService {
	
	//get All
	List<Cliente> getAllClienti();
	
	//Cliente by ID
	Cliente getClienteByID(int id);
	
	//exists by ID
	boolean existsClienteByID(int id);

}
