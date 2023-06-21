package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.Biglietto;

public interface BigliettoRepository extends CrudRepository<Biglietto, Integer> {
	
	Biglietto findByCodcliente(String cod_cliente);
	Biglietto findByIdvolo (int id_volo);
	
	boolean existsByCodcliente(String cod_cliente);
	boolean existsByIdvolo (int id_volo);

}
