package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.info.BigliettoInfo;
import com.model.Biglietto;
import com.model.Spettacolo;
import com.service.IBigliettoService;
import com.service.ISpettacoloService;

@RestController
@RequestMapping(value = "biglietteria")
@CrossOrigin
public class BigliettoController {
	
	@Autowired
	private IBigliettoService service;
	
	@Autowired
	private ISpettacoloService serviceSp;
	
	//get biglietti
	@GetMapping(value="biglietti", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<BigliettoInfo>> getAllBiglietti(){
		List<Biglietto> lstBiglietto = service.getAllBiglietti();
		List<BigliettoInfo> lstAllInfo = new ArrayList<>();
		for (int i = 0; i < lstBiglietto.size(); i++) {
			BigliettoInfo info = new BigliettoInfo();
			BeanUtils.copyProperties(lstBiglietto.get(i), info);
			lstAllInfo.add(info);
		}
		return new ResponseEntity<List<BigliettoInfo>>(lstAllInfo,HttpStatus.OK);
	}
	
	//get Biglietto by ID
	@GetMapping(value="biglietto/{cod_biglietto}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<BigliettoInfo> getBigliettoByCodBiglietto(@PathVariable("cod_biglietto") String cod_biglietto){
		boolean flag = service.existsBiglietto(cod_biglietto);
		if(!flag) {
			//implementare con l'errore custom id entità non esistente
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		Biglietto bl = service.getBigliettoBycodBiglietto(cod_biglietto);
		BigliettoInfo info = new BigliettoInfo();
		BeanUtils.copyProperties(bl, info);
		return new ResponseEntity<BigliettoInfo>(info,HttpStatus.OK);
	}
	
	//add
	@PostMapping(value="biglietto", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Void> addBiglietto(@RequestBody BigliettoInfo info,UriComponentsBuilder builder ){
		//controllo sulle quantita
		if(info.getQuantita()<1) {
			//implementare con exc custom qt inferiore a 1
			return new ResponseEntity<Void>(HttpStatus.FORBIDDEN);
		}
		//esiste già
		boolean flag = service.existsBiglietto(info.getCodbiglietto());
		if(flag) {
			//implementare con exc custom entita già presente
			return new ResponseEntity<Void>(HttpStatus.FORBIDDEN);// esiste e non posso aggiungerlo
		}
		Biglietto bl = new Biglietto();
		BeanUtils.copyProperties(info, bl);
		//controllo l'effettivo inserimento
		boolean addOK = service.addBiglietto(bl);
		if(!addOK) {
			//implementare con exc custom non è possibile aggiungere l'entità
			return new ResponseEntity<Void>(HttpStatus.FORBIDDEN);// esiste e non posso aggiungerlo
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("biglietto/{codBiglietto}")
				.buildAndExpand(bl.getCodbiglietto()).toUri());
		return new ResponseEntity<>(headers,HttpStatus.CREATED);
	}
	
	//update - controllare il metodo 
	@PutMapping(value="biglietto", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<BigliettoInfo> updateBiglietto(@RequestBody BigliettoInfo info,UriComponentsBuilder builder ){
		//controllo sulle quantita
		if(info.getQuantita()<1) {
			//implementare con exc custom qt inferiore a 1
			return new ResponseEntity<BigliettoInfo>(HttpStatus.FORBIDDEN);
		}
		//controllo sull'esistenza efettiva del biglietto
		boolean flag = service.existsBiglietto(info.getCodbiglietto());
		if(!flag) {
			//implementare con exc custom entita non presente
			return new ResponseEntity<BigliettoInfo>(HttpStatus.FORBIDDEN);
		}
		//controllo se può essere prenotabile
		try {
			Spettacolo spCheck =  serviceSp.getSpettacoloBycodSpettacolo(info.getCodspettacolo());
			boolean isPrenotabile = service.isPrenotabile(spCheck.getCodspettacolo(), info.getQuantita());
			if(!isPrenotabile) {
				//implementare con exc custom entita già presente
				return new ResponseEntity<BigliettoInfo>(HttpStatus.FORBIDDEN);
			}
		} catch (Exception e) {
			// implementare il catch - non esista uno spettacolo con il codice passato
		}
		// mi serve il supporto per aggiornate il biglietto, qt già inserite
		int qtDB = service.getBigliettoBycodBiglietto(info.getCodbiglietto()).getQuantita();
		int qtUpdate = qtDB+info.getQuantita();
		Biglietto bl = new Biglietto();
		//nuove quantita aggiornate
		bl.setQuantita(qtUpdate);
		BeanUtils.copyProperties(info, bl);
		
		service.updateBiglietto(bl);
		//copio l'entità 
		BigliettoInfo blInfo = new BigliettoInfo();
		BeanUtils.copyProperties(bl, blInfo);
		return new ResponseEntity<BigliettoInfo>(blInfo,HttpStatus.OK);
	}

}
