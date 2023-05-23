package com.example.gestionevoli.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.http.MediaType;

import com.example.gestionevoli.entity.Aereo;
import com.example.gestionevoli.entity.Company;
import com.example.gestionevoli.errors.EntityNotFoundException;
import com.example.gestionevoli.service.IAereoService;
import com.example.gestionevoli.service.ICompanyService;

@RestController
@RequestMapping(name = "gestioneCompagnia")
@CrossOrigin
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

	@GetMapping(value= "aereo", produces = {MediaType.APPLICATION_JSON_VALUE} )
	public ResponseEntity<List<AereoInfo>> getAllAerei(){
		List<AereoInfo> lstInfoAerei = new ArrayList<>();
		List<Aereo> lstAerei = service.getAllAereo();
		for (int i = 0; i < lstAerei.size(); i++) {
			AereoInfo info = new AereoInfo();
			BeanUtils.copyProperties(lstAerei.get(i), info);
			lstInfoAerei.add(info);
		}
		return new ResponseEntity<List<AereoInfo>>(lstInfoAerei,HttpStatus.OK);
	}
	
	@PostMapping(value="aereo", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Void> addAereo(@RequestBody AereoInfo info, UriComponentsBuilder builder){
		Aereo ae = new Aereo();
		BeanUtils.copyProperties(info, ae);
		boolean flag = service.addAereo(ae);
		if(!flag) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("aereo/{id}").buildAndExpand(ae.getIdAereo()).toUri());
		return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
	}
	
	@PutMapping(value="aereo", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<AereoInfo> updateAereo(@RequestBody AereoInfo info){
		Aereo ae = new Aereo();
		BeanUtils.copyProperties(info, ae);
		AereoInfo aeInfo = new AereoInfo();
		BeanUtils.copyProperties(ae, aeInfo);
		boolean flag = service.existById(aeInfo.getIdAereo());
		if(!flag) {
			throw new EntityNotFoundException("Aereo con id: " +aeInfo.getIdAereo() + " non dipsonibile");
		}
		service.updateAereo(ae);
		return new ResponseEntity<AereoInfo>(aeInfo,HttpStatus.OK);
	}
	
	public ResponseEntity<Void> deleteAereo(@PathVariable("id") String id, UriComponentsBuilder builder){
		boolean flag = service.existById(id);
		if(!flag) {
			throw new EntityNotFoundException("Aereo con id: " + id + " non dipsonibile per essere eliminato");
		}
		service.deleteAereo(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
}
