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
import com.example.gestionevoli.service.ICompanyService;
import com.example.gestionevoli.service.IVoloService;

@RestController
@RequestMapping("gestioneCompagnia")
public class VoloController {
	
	@Autowired
	private IVoloService voloService;
	
	@GetMapping(value="voli/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<VoloInfo> getVoloById(@PathVariable("id") String id){
		VoloInfo info = new VoloInfo();
		if(!voloService.existsById(id)) {
			return new ResponseEntity<VoloInfo>(info,HttpStatus.NOT_FOUND);
		}
		BeanUtils.copyProperties(voloService.getVoloById(id), info);
		return new ResponseEntity<VoloInfo>(info,HttpStatus.OK);
	}
	
	@GetMapping(value="voli", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<VoloInfo>> getAllVoli(){
		List<VoloInfo> resVoloInfo = new ArrayList<>();
		List<Volo> voloList = voloService.getAllVoli();
		for (int i = 0; i < voloList.size(); i++) {
			VoloInfo info = new VoloInfo();
			BeanUtils.copyProperties(voloList.get(i), info);
			resVoloInfo.add(info);
		}
		return new ResponseEntity<List<VoloInfo>>(resVoloInfo,HttpStatus.OK);
	}

}
