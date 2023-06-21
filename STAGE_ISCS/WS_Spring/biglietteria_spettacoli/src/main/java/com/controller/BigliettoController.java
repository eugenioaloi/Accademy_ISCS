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
	
	//get biglietti
	@GetMapping(value="biglietti/{cliente_id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<BigliettoInfo>> getAllBigliettiByIdCliente(@PathVariable("cliente_id") int id){
		List<Biglietto> lstBiglietto = service.getAllBigliettiByIdCliente(id);
		List<BigliettoInfo> lstAllInfo = new ArrayList<>();
		for (int i = 0; i < lstBiglietto.size(); i++) {
			BigliettoInfo info = new BigliettoInfo();
			BeanUtils.copyProperties(lstBiglietto.get(i), info);
			lstAllInfo.add(info);
		}
		return new ResponseEntity<List<BigliettoInfo>>(lstAllInfo,HttpStatus.OK);
	}
	
	//get Biglietto by ID
	@GetMapping(value="biglietto/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<BigliettoInfo> getBigliettoByCodBiglietto(@PathVariable("id") int id){
		boolean flag = service.existsBiglietto(id);
		if(!flag) {
			//implementare con l'errore custom id entità non esistente
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		Biglietto bl = service.getBigliettoBycodBiglietto(id);
		BigliettoInfo info = new BigliettoInfo();
		BeanUtils.copyProperties(bl, info);
		return new ResponseEntity<BigliettoInfo>(info,HttpStatus.OK);
	}
	
	//add
	@PostMapping(value="biglietto", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Void> addBiglietto(@RequestBody BigliettoInfo info,UriComponentsBuilder builder ){
		//controllo sulle quantita
		if(info.getQuantita()<1) {
			return new ResponseEntity<Void>(HttpStatus.FORBIDDEN);//403
		}
		//controllo se esiste il biglietto, se esiste non posso aggiungerlo
		boolean flag = service.existsBiglietto(info.getId());
		if(flag) {
			return new ResponseEntity<Void>(HttpStatus.FORBIDDEN);// esiste e non posso aggiungerlo
		}
		Biglietto bl = new Biglietto();
		BeanUtils.copyProperties(info, bl);
		//controllo l'effettivo inserimento
		boolean addOK = service.addBiglietto(bl);
		if(!addOK) {
			return new ResponseEntity<Void>(HttpStatus.FORBIDDEN);// esiste e non posso aggiungerlo
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("biglietto/{id}")
				.buildAndExpand(bl.getId()).toUri());
		return new ResponseEntity<>(headers,HttpStatus.CREATED);
	}
	
	@PutMapping(value="biglietto", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<BigliettoInfo> updateBiglietto(@RequestBody BigliettoInfo info,UriComponentsBuilder builder ){
		//controllo sulle quantita
		if(info.getQuantita()<1) {
			return new ResponseEntity<BigliettoInfo>(HttpStatus.FORBIDDEN);
		}
		//controllo sull'esistenza efettiva del biglietto
		boolean flag = service.existsBiglietto(info.getId());
		if(!flag) {
			return new ResponseEntity<BigliettoInfo>(HttpStatus.NOT_FOUND);
		}
		//controllo se può essere prenotabile
		Biglietto bl = service.getBigliettoBycodBiglietto(info.getId());
		boolean isPrenotabile = service.isPrenotabile(bl, info.getQuantita());
		if(!isPrenotabile) {
			return new ResponseEntity<BigliettoInfo>(HttpStatus.FORBIDDEN);
		}
		//può essere aggiornato - mi faccio ritornare i dati
		int qtDb = bl.getQuantita();
		int qtUpdate = info.getQuantita();
		//aggiorno il dato, tenendo conto già delle qt presenti
		bl.setQuantita(qtDb+qtUpdate);
		service.updateBiglietto(bl);
		//provvedo a passare l'entità con i suoi valori corrispondenti all'entità info
		BigliettoInfo blInfo = new BigliettoInfo();
		BeanUtils.copyProperties(bl, blInfo);
		return new ResponseEntity<BigliettoInfo>(blInfo,HttpStatus.OK);
	}

}
