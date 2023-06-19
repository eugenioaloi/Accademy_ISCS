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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.BigliettoInfo;
import com.info.ClienteInfo;
import com.info.SpettacoloInfo;
import com.model.Biglietto;
import com.model.Cliente;
import com.model.Spettacolo;
import com.service.IClienteService;
import com.service.ISpettacoloService;

@RestController
@RequestMapping(value = "biglietteria")
@CrossOrigin
public class SpettacoloController {
	
	@Autowired
	private ISpettacoloService service;
	
	//get clienti
	@GetMapping(value="spettacoli", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<SpettacoloInfo>> getAllSpettacoli(){
		List<Spettacolo> lstSpettacolo = service.getAllSpettacoli();
		List<SpettacoloInfo> lstAllInfo = new ArrayList<>();
		for (int i = 0; i < lstSpettacolo.size(); i++) {
			SpettacoloInfo info = new SpettacoloInfo();
			BeanUtils.copyProperties(lstSpettacolo.get(i), info);
			lstAllInfo.add(info);
		}
		return new ResponseEntity<List<SpettacoloInfo>>(lstAllInfo,HttpStatus.OK);
	}
	
	@GetMapping(value="spettacolo/{cod_spettacolo}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<SpettacoloInfo> getSpettacoloById(@PathVariable("cod_spettacolo") String cod_spettacolo){
		//check dell'esistenza tramite cod_spettacolo
		boolean flag = service.existsSpettacolo(cod_spettacolo);
		if(!flag) {
			return new ResponseEntity<SpettacoloInfo>(HttpStatus.NOT_FOUND);//lo spettacolo non è stato trovato
		}
		Spettacolo sp = service.getSpettacoloBycodSpettacolo(cod_spettacolo);
		SpettacoloInfo info = new SpettacoloInfo();
		BeanUtils.copyProperties(sp, info);
		return new ResponseEntity<SpettacoloInfo>(info,HttpStatus.OK);
	}

}
