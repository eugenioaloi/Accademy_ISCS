package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	
}
