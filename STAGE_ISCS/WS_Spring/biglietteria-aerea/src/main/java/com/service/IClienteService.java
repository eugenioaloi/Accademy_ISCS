package com.service;

import java.util.List;

import com.model.Cliente;

public interface IClienteService {
	
	//get all- lista clienti
	List<Cliente> getAllClienti();
	
	// get Cliente by cod_cliente - Cliente
	Cliente getClienteByIdCliente (String cod_cliente);
	
	// exists Cliente by cod_cliente - booolean
	boolean existsClienteByIdCliente (String cod_cliente);
	
}
