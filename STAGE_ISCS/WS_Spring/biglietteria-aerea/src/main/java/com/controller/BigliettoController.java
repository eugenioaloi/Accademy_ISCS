package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
import com.service.IBigliettoService;

@RestController
@RequestMapping(value="gestionebiglietteria")
@CrossOrigin
public class BigliettoController {
	
	@Autowired
	private IBigliettoService service;
	
	// get all Biglietti by cod_cliente
	@GetMapping(value="biglietti/{cod_cliente}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<BigliettoInfo>> getAllBigliettiByCodCliente(@PathVariable String cod_cliente){
		List<Biglietto> lst = service.getAllBigliettiByCodCliente(cod_cliente);
		List<BigliettoInfo> lstInfo = new ArrayList<>();
		for(Biglietto bl:lst) {
			BigliettoInfo info = new BigliettoInfo();
			BeanUtils.copyProperties(bl, info);
			lstInfo.add(info);
		}
		return new ResponseEntity<List<BigliettoInfo>>(lstInfo, HttpStatus.OK);//200
	}
	
	//Biglietto by cod_cliente
	@GetMapping(value="biglietto/{cod_cliente}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BigliettoInfo> getBigliettoByCodCliente(@PathVariable String cod_cliente){
		boolean flag = service.existsBigliettoByCodCliente(cod_cliente);
		if(!flag) {//non è stato possibile tornare un biglietto con il cod_cliente passato
			return new ResponseEntity<BigliettoInfo>(HttpStatus.NOT_FOUND);//404
		}
		Biglietto bl = service.getBigliettoByCodCliente(cod_cliente);
		BigliettoInfo info = new BigliettoInfo();
		BeanUtils.copyProperties(bl, info);
		return new ResponseEntity<BigliettoInfo>(info, HttpStatus.OK);//200
	}
	
	@PostMapping(value="biglietto", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BigliettoInfo> addBiglietto(@RequestBody BigliettoInfo info,UriComponentsBuilder builder){
		//controllo se il biglietto esiste già per ID
		boolean first_flag = service.existsById(info.getId());
		if(first_flag) {//il biglietto esiste già
			return new ResponseEntity<>(HttpStatus.CONFLICT);//409
		}
		//controllo le quantità richieste
		boolean second_flag = info.getQtbiglietti()>1;
		if(!second_flag) {//deve essere almeno prenotato un biglietto, zero o < di zero non è possibile
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);//400
		}
		//posso procedere
		Biglietto bl = new Biglietto();
		BeanUtils.copyProperties(info, bl);
		boolean addOK = service.addBiglietto(bl);
		if(!addOK) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);//417
		}
		BigliettoInfo blInfo = new BigliettoInfo();
		BeanUtils.copyProperties(bl, blInfo);
		return new ResponseEntity<BigliettoInfo>(blInfo,HttpStatus.CREATED);
	}
	
	@PutMapping(value="biglietto", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BigliettoInfo> updateBiglietto(@RequestBody BigliettoInfo info,UriComponentsBuilder builder){
		//implementare la parte di update
		
		return new ResponseEntity<BigliettoInfo>(HttpStatus.CREATED);
	}

}
