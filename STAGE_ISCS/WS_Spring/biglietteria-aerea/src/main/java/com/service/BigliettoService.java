package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Biglietto;
import com.repository.BigliettoRepository;
import com.repository.VoloRepository;

@Service
public class BigliettoService implements IBigliettoService{
	
	@Autowired
	private BigliettoRepository repo;
	
	@Autowired
	private VoloRepository voloRepo;

	@Override
	public List<Biglietto> getAllBiglietti() {
		List<Biglietto> lst = new ArrayList<>();
		repo.findAll().forEach(bl->lst.add(bl));
		return lst;
	}

	@Override
	public List<Biglietto> getAllBigliettiByCodCliente(String cod_cliente) {
		List<Biglietto> lst = getAllBiglietti();
		List<Biglietto> lstByCodCliente = new ArrayList<>();
		for(Biglietto bl:lst) {
			if(bl.getCodcliente().equalsIgnoreCase(cod_cliente)) {
				lstByCodCliente.add(bl);
			}
		}
		return lstByCodCliente;
	}

	@Override
	public Biglietto getBigliettoByCodCliente(String cod_cliente) {
		return repo.findByCodcliente(cod_cliente);
	}

	@Override
	public Biglietto getBigliettoByIdVolo(int id_volo) {
		return repo.findByIdvolo(id_volo);
	}

	@Override
	public boolean existsBigliettoByCodCliente(String cod_cliente) {
		return repo.existsByCodcliente(cod_cliente);
	}

	@Override
	public boolean existsBigliettoByIdVolo(int id_volo) {
		return repo.existsByIdvolo(id_volo);
	}

	@Override
	public boolean isPrenotabile(Biglietto bl, int richiestaBiglietti) {
		//controllo i posti disponibili per un volo
		int postiDisponibili = voloRepo.findById(bl.getId()).get().getPostidisponibili();
		//la richiesta dei posti è minore o == ai posti disponibili ergo si può prenotare
		boolean flag = richiestaBiglietti<postiDisponibili;
		return flag?true:false;
	}

	@Override
	public boolean addBiglietto(Biglietto bl) {
		//controllo se il biglietto non esiste già
		boolean flag = repo.existsById(bl.getId());//true se esiste
		if(flag) {
			return false;
		}	
		repo.save(bl);
		return true;
	}

	@Override
	public boolean updateBiglietto(Biglietto bl) {
		//controllo se il biglietto esiste 
		boolean flag = repo.existsById(bl.getId());//true se esiste
		if(!flag) {// il biglietto non esiste
			return false;
		}
		repo.save(bl);
		return true;
	}

	@Override
	public boolean existsById(int id) {
		return repo.existsById(id);
	}

}
