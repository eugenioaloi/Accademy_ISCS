package com.example.gestionevoli.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestionevoli.entity.Cliente;
import com.example.gestionevoli.repository.ClienteRepository;

@Service
public class ClienteService implements IClienteService{
	
	@Autowired
	private ClienteRepository repo;

	@Override
	public List<Cliente> getAllCliente() {
		List<Cliente> lst = new ArrayList<>();
		repo.findAll().forEach(cl->lst.add(cl));
		return lst;
	}

	@Override
	public boolean existById(String clientId) {
		return repo.existsById(clientId);
	}

	@Override
	public Cliente getClienteById(String clienteId) {
		return repo.findById(clienteId).get();
	}

	@Override
	public boolean addCliente(Cliente cl) {
		if(existById(cl.getIdCliente())) {
			return false;
		}else {
			repo.save(cl);
			return true;
		}
	}

	@Override
	public void updateCliente(Cliente cl) {
		repo.save(cl);
	}

	@Override
	public void deleteCliente(String clienteId) {
		repo.delete(getClienteById(clienteId));
	}

}
