package com.example.gestionevoli.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.gestionevoli.entity.Company;
import com.example.gestionevoli.entity.Volo;
import com.example.gestionevoli.errors.EntityNotFoundException;
import com.example.gestionevoli.service.ICompanyService;
import com.example.gestionevoli.service.IVoloService;

@RestController
@RequestMapping("gestioneCompagnia")
public class VoloController {
	
	@Autowired
	private IVoloService service;
	
	@GetMapping(value="volo/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<VoloInfo> getVoloById(@PathVariable("id") String id){
		VoloInfo info = new VoloInfo();
		if(!service.existsById(id)) {
			return new ResponseEntity<VoloInfo>(info,HttpStatus.NOT_FOUND);
		}
		BeanUtils.copyProperties(service.getVoloById(id), info);
		return new ResponseEntity<VoloInfo>(info,HttpStatus.OK);
	}
	
	@GetMapping(value="voli", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<VoloInfo>> getAllVoli(){
		List<VoloInfo> resVoloInfo = new ArrayList<>();
		List<Volo> voloList = service.getAllVoli();
		for (int i = 0; i < voloList.size(); i++) {
			VoloInfo info = new VoloInfo();
			BeanUtils.copyProperties(voloList.get(i), info);
			resVoloInfo.add(info);
		}
		return new ResponseEntity<List<VoloInfo>>(resVoloInfo,HttpStatus.OK);
	}
	
	@PutMapping(value="volo", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Void> addVolo(@RequestBody VoloInfo info, UriComponentsBuilder builder){
		Volo volo = new Volo();
		BeanUtils.copyProperties(info, volo);
		boolean flag = service.addVolo(volo);
		if(!flag) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/volo/{id}").buildAndExpand(volo.getIdVolo()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	

}
