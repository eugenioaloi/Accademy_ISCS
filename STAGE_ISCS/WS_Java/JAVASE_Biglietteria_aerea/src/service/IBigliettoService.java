package service;

import java.util.List;

import model.Biglietto;

public interface IBigliettoService {
	
	//getAll List
	public List<Biglietto> getAllBiglietti();

	//getBiglietto List by idCliente
	public List<Biglietto> getAllBigliettiByCliente(String id_cliente);
	
	//existById boolean
	public boolean existById(int idBiglietto);
	
	//getById Cliente
	public Biglietto getBigliettoById(int idBiglietto);
	
	//add boolean
	public boolean addBiglietto(String cod_cliente, String tipo_pagamento,
			int qt_biglietti, String id_volo);
	
	//update void
	public boolean updateBiglietto(String cod_cliente, String tipo_pagamento,
			int qt_biglietti, String id_volo,  int cod_operazione);
	
	//restituisce i biglietti già comprati per un determinato volo
	public int getQtBigliettiComprati(String idVolo);

}
