package com.service;

import java.util.ArrayList;
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
	public Biglietto getBigliettoBycodBiglietto(String cod_Biglietto) {
		return repo.findByCodbiglietto(cod_Biglietto);
	}

	@Override
	public boolean existsBiglietto(String cod_Biglietto) {
		return repo.existsByCodbiglietto(cod_Biglietto);
	}

	@Override
	public boolean isPrenotabile(String cod_spettacolo, int quantita) {
		int capienza = repoSp.findByCodspettacolo(cod_spettacolo).getCapienza();
		return capienza>quantita;
	}

	@Override
	public boolean addBiglietto(Biglietto bl) {
		//il biglietto non deve già esistere
		boolean flag = repo.existsByCodbiglietto(bl.getCodbiglietto());
		if(flag) {
			return false;
		}
		repo.save(bl);
		return true;
	}

	@Override
	public boolean updateBiglietto(Biglietto bl) {
		//il biglietto deve esistere
		boolean exists = repo.existsByCodbiglietto(bl.getCodbiglietto());
		if(!exists) {
			return false;// il biglietto non esiste
		}
		//si controlla se ci sono posti disponibili
		boolean isPrenotabile = isPrenotabile(bl.getCodspettacolo(), bl.getQuantita());
		if(!isPrenotabile) {
			return false;// non è possibile aggiornare per mancanza di posti
		}
		//posso salvare il biglietto
		repo.save(bl);
		return true;
	}

}
