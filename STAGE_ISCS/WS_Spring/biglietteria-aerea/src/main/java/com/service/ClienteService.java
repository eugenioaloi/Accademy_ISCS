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
	public Cliente getClienteByIdCliente(String cod_cliente) {
		return repo.findByCodcliente(cod_cliente);
	}

	@Override
	public boolean existsClienteByIdCliente(String cod_cliente) {
		return repo.existsByCodcliente(cod_cliente);
	}

}
