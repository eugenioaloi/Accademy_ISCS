package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Cliente;
import com.repository.ClienteRepository;

@Service
public class ClienteService implements IClienteService {
	
	@Autowired
	private ClienteRepository repo;

	@Override
	public List<Cliente> getAllClienti() {
		List<Cliente> lst = new ArrayList<>();
		repo.findAll().forEach(cl->lst.add(cl));
		return lst;
	}

	@Override
	public Cliente getClienteById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public boolean existsClienteById(int id) {
		return repo.existsById(id);
	}

}
