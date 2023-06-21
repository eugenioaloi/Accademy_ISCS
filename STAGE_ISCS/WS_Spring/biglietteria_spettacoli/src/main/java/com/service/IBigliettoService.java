package com.service;

import java.util.List;

import com.model.Biglietto;

public interface IBigliettoService {
	
	//get all
	List<Biglietto> getAllBiglietti();
	
	//get all list biglietti by id_cliente
	List<Biglietto> getAllBigliettiByIdCliente(int cliente_id);
	
	//get by id
	Biglietto getBigliettoBycodBiglietto(int id);
	
	//exists
	boolean existsBiglietto(int id);
	
	//add Biglietto
	boolean addBiglietto(Biglietto bl);
	
	//Update Biglietto
	boolean updateBiglietto(Biglietto bl);
	
	//is prenotabile
	boolean isPrenotabile(Biglietto bl,int quantita);
	

}
