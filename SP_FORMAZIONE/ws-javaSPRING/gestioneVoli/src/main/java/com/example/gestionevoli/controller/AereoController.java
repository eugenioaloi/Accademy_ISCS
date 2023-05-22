package com.example.gestionevoli.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;


import com.example.gestionevoli.errors.EntityNotFoundException;
import com.example.gestionevoli.service.IAereoService;

@RestController
@RequestMapping(name = "gestioneCompagnia")
public class AereoController {
	
	@Autowired
	private IAereoService service;
	
	@GetMapping(value="aereo/{id}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<AereoInfo> getAereoById(@PathVariable("id") String id){
		AereoInfo info = new AereoInfo();
		if(!service.existById(id)) {
			throw new EntityNotFoundException("L'aereo con " + id+ " non è stato trovato");
		}
		BeanUtils.copyProperties(service.getAereoById(id), info);
		return new ResponseEntity<AereoInfo>(info,HttpStatus.OK);
	}

}
