package com.example.gestionevoli.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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

import com.example.gestionevoli.entity.Aereoporto;
import com.example.gestionevoli.errors.EntityNotFoundException;
import com.example.gestionevoli.service.IAereoportoService;

@RestController
@RequestMapping("gestioneCompagnia")
@CrossOrigin
public class AereoportoController {
	
	@Autowired
	private IAereoportoService service;
	
	@GetMapping(value="aereoporti", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<AereoportoInfo>> getAllVoli(){
		List<AereoportoInfo> aeInfo = new ArrayList<>();
		List<Aereoporto> aepList = service.getAllAereoporto();
		for (int i = 0; i <aepList.size() ; i++) {
			AereoportoInfo info = new AereoportoInfo();
			BeanUtils.copyProperties(aepList.get(i), info);
			aeInfo.add(info);
		}
		return new ResponseEntity<List<AereoportoInfo>>(aeInfo, HttpStatus.OK);
	}
	
	@GetMapping(value="aereoporto/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<AereoportoInfo> getAereoportoById(@PathVariable("id") String id){
		AereoportoInfo info = new AereoportoInfo();
		if(!service.existById(id)) {
			return new ResponseEntity<AereoportoInfo>(info,HttpStatus.NOT_FOUND);
		}
		BeanUtils.copyProperties(service.getAereoportoById(id), info);
		return new ResponseEntity<AereoportoInfo>(info,HttpStatus.OK);
	}
	
	@PostMapping(value="aereoporto", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Void> addAereoporto(@RequestBody AereoportoInfo info, UriComponentsBuilder builder){
		Aereoporto aep = new Aereoporto();
		BeanUtils.copyProperties(info, aep);
		boolean flag = service.addAereoporto(aep);
		if(!flag) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/aereoporto/{id}").buildAndExpand(aep.getIdAereoporto()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@PutMapping(value= "aereoporto}", produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<AereoportoInfo> updateCompany(@RequestBody AereoportoInfo info){
		Aereoporto aep = new Aereoporto();
		BeanUtils.copyProperties(info, aep);
		AereoportoInfo aepinfo = new AereoportoInfo();
		BeanUtils.copyProperties(aep, aepinfo);
		boolean flag = service.existById(aep.getIdAereoporto());
		if(!flag) {
			return new ResponseEntity<AereoportoInfo>(aepinfo, HttpStatus.NOT_FOUND);
		}
		service.updateAereoporto(aep);
		return new ResponseEntity<AereoportoInfo>(aepinfo,HttpStatus.OK);
	}
	
	@DeleteMapping(value= "aereoporto/{id}", produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> deleteAereoporto(@PathVariable("id") String id, UriComponentsBuilder builder) {
		if (!service.existById(id)) {
			throw new EntityNotFoundException("Aereoporto con id " + id + " non disponibile");
		}
		service.deleteAereoporto(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	
	
	
}
