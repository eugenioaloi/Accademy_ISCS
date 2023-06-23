package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.Biglietto;

public interface BigliettoRepository extends CrudRepository<Biglietto, Integer>{
	
	Biglietto findByClienteid(int id_cliente);
	boolean existsByClienteid(int id_cliente);
	
	Biglietto findByVoloid(int id_volo);
	boolean existsByVoloid(int id_volo);

}
