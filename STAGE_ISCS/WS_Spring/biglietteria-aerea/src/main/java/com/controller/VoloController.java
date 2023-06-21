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

import com.info.VoloInfo;
import com.model.Volo;
import com.service.IVoloService;

@RestController
@RequestMapping(value="gestionebiglietteria")
@CrossOrigin
public class VoloController {
	
	@Autowired
	private IVoloService service;
	
	// get all Clienti by cod_Volo
	@GetMapping(value="voli", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<VoloInfo>> getAllClientiByCodVolo(){
		List<Volo> lst = service.getAllVoli();
		List<VoloInfo> lstInfo = new ArrayList<>();
		for(Volo cl:lst) {
			VoloInfo info = new VoloInfo();
			BeanUtils.copyProperties(cl, info);
			lstInfo.add(info);
		}
		return new ResponseEntity<List<VoloInfo>>(lstInfo, HttpStatus.OK);//200
	}
	
	//Volo by cod_Volo
	@GetMapping(value="volo/{cod_volo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<VoloInfo> getVoloByCodVolo(@PathVariable int cod_volo){
		boolean flag = service.exitsVoloById(cod_volo);
		if(!flag) {//non è stato possibile tornare un Volo con il cod_Volo passato
			return new ResponseEntity<VoloInfo>(HttpStatus.NOT_FOUND);//404
		}
		Volo cl = service.getVoloById(cod_volo);
		VoloInfo info = new VoloInfo();
		BeanUtils.copyProperties(cl, info);
		return new ResponseEntity<VoloInfo>(info, HttpStatus.OK);//200
	}

}
