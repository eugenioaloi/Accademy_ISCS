package com.service;

import java.util.List;

import com.model.Biglietto;

public interface IBigliettoService {
	
	//get all Biglietti
	List<Biglietto> getAllBiglietti();
	
	// get all Biglietti by cod_cliente
	List<Biglietto> getAllBigliettiByCodCliente(String cod_cliente);
	
	//Biglietto by cod_cliente
	Biglietto getBigliettoByCodCliente (String cod_cliente);
	
	//Biglietto by id_volo
	Biglietto getBigliettoByIdVolo (int id_volo);
	
	//exists Biglietto by cod_cliente
	boolean existsBigliettoByCodCliente (String cod_cliente);
	
	//exists Biglietto by id_volo
	boolean existsBigliettoByIdVolo (int id_volo);
	
	//exits by ID
	boolean existsById (int id);
	
	//add biglietto
	boolean addBiglietto (Biglietto bl);
	
	//update biglietto
	boolean updateBiglietto (Biglietto bl);
	
	//Biglietto isPrenotabile - boolean. restituisce la possibilità di prenotare o meno un biglietto
	boolean isPrenotabile(Biglietto bl, int richiestaBiglietti);
	
}
