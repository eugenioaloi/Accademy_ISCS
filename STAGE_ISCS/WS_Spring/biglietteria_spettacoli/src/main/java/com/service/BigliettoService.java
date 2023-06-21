package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Biglietto;
import com.repository.BigliettoRepository;
import com.repository.SpettacoloRepository;

@Service
public class BigliettoService implements IBigliettoService {
	
	@Autowired
	private BigliettoRepository repo;
	
	@Autowired
	private SpettacoloRepository repoSp;

	@Override
	public List<Biglietto> getAllBiglietti() {
		List<Biglietto> lst = new ArrayList<>();
		repo.findAll().forEach(bl->lst.add(bl));
		return lst;
	}

	@Override
	public Biglietto getBigliettoBycodBiglietto(int id) {
		return repo.findById(id).get();
	}

	@Override
	public boolean existsBiglietto(int id) {
		return repo.existsById(id);
	}

	@Override
	public boolean addBiglietto(Biglietto bl) {
		//se esiste non si aggiunge
		boolean flag = existsBiglietto(bl.getId());//true esiste
		if(flag) {
			return false;
		}
		repo.save(bl);
		return true;
	}

	@Override
	public boolean updateBiglietto(Biglietto bl) {
		//se non esiste non si può modificare
		boolean flag = existsBiglietto(bl.getId());//true esiste
		if(!flag) {
			return false;
		}
		repo.save(bl);
		return true;
	}

	@Override
	public boolean isPrenotabile(Biglietto bl, int quantita) {
		int capienza = repoSp.findByBigliettoid(bl.getId()).getCapienza();
		boolean prenotabile = capienza<quantita;//true non è prenotabile
		return prenotabile? false:true;
	}

	@Override
	public List<Biglietto> getAllBigliettiByIdCliente(int cliente_id) {
		List<Biglietto> lstAllBiglietti = getAllBiglietti();
		List<Biglietto> lst = new ArrayList<>();
		for(Biglietto bl:lstAllBiglietti) {
			if(bl.getClienteid() == cliente_id) {
				lst.add(bl);
			}
		}
		return lst;
	}

}
