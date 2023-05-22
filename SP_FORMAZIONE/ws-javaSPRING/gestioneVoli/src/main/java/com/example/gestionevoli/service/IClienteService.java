package com.example.gestionevoli.service;

import java.util.List;

import com.example.gestionevoli.entity.Cliente;

public interface IClienteService {
	
	//getAll List
	public List<Cliente> getAllCliente();
	
	//existById boolean
	public boolean existById(String clientId);
	
	//getById Cliente
	public Cliente getClienteById(String clienteId);
	
	//add boolean
	public boolean addCliente(Cliente cl);
	
	//update void
	public void updateCliente(Cliente cl);
	
	//delete void
	public void deleteCliente (String clienteId);
	

}
