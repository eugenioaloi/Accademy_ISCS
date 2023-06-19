package com.service;

import java.util.List;

import com.model.Cliente;

public interface IClienteService {
	
	//get all
	List<Cliente> getAllClienti();
	
	//get by cod Cliente
	Cliente getClienteBycodCliente(String cod_Cliente);
	
	//exists
	boolean existsCliente(String cod_Cliente);
	

}
