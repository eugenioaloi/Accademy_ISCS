package com.example.gestionevoli.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.gestionevoli.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {

}
