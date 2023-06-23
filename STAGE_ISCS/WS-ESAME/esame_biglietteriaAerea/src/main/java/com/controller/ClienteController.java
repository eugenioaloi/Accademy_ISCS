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

import com.info.ClienteInfo;
import com.model.Cliente;
import com.service.IClienteService;

@RestController
@RequestMapping(value = "gestionevoli")
@CrossOrigin
public class ClienteController {
	
	@Autowired
	private IClienteService service;
	
	//get all
	@GetMapping(value="clienti", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ClienteInfo>> getAllClienti(){
		List<Cliente> lstAll = service.getAllClienti();
		List<ClienteInfo> lstAllInfo = new ArrayList<>();
		for(int i= 0;i<lstAll.size();i++) {
			ClienteInfo info = new ClienteInfo();
			BeanUtils.copyProperties(lstAll.get(i), info);
			lstAllInfo.add(info);
		}
		return new ResponseEntity<List<ClienteInfo>>(lstAllInfo,HttpStatus.OK);//200 tutto OK
	}
	
	//get by id
	@GetMapping(value="cliente/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ClienteInfo> getClienteByID(@PathVariable("id") int id){
		//controllo se l'id è previsto
		boolean flag = service.existsClienteByID(id);//false non esiste
		if(!flag) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);//404 non trovato
		}
		Cliente cliente = service.getClienteByID(id);
		ClienteInfo info = new ClienteInfo();
		BeanUtils.copyProperties(cliente, info);
		return new ResponseEntity<ClienteInfo>(info,HttpStatus.OK);//200 tutto OK
	}
	

}
