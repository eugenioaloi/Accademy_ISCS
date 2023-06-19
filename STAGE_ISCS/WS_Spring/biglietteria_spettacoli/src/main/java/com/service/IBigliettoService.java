package com.service;

import java.util.List;

import com.model.Biglietto;

public interface IBigliettoService {
	
	//get all
	List<Biglietto> getAllBiglietti();
	
	//get by cod Biglietto
	Biglietto getBigliettoBycodBiglietto(String cod_Biglietto);
	
	//exists
	boolean existsBiglietto(String cod_Biglietto);
	
	//add Biglietto
	boolean addBiglietto(Biglietto bl);
	
	//Update Biglietto
	boolean updateBiglietto(Biglietto bl);
	
	//is prenotabile
	boolean isPrenotabile(String cod_spettacolo,int quantita);
	

}
