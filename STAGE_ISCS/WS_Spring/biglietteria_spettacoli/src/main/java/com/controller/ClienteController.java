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
@RequestMapping(value = "biglietteria")
@CrossOrigin
public class ClienteController {
	
	@Autowired
	private IClienteService service;
	
	//get clienti
	@GetMapping(value="clienti", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<ClienteInfo>> getAllClienti(){
		List<Cliente> lstCliente = service.getAllClienti();
		List<ClienteInfo> lstAllInfo = new ArrayList<>();
		for (int i = 0; i < lstCliente.size(); i++) {
			ClienteInfo info = new ClienteInfo();
			BeanUtils.copyProperties(lstCliente.get(i), info);
			lstAllInfo.add(info);
		}
		return new ResponseEntity<List<ClienteInfo>>(lstAllInfo,HttpStatus.OK);
	}
	
	//get Cliente by ID
	@GetMapping(value="cliente/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<ClienteInfo> getClienteById(@PathVariable("id") int id){
		//controllo se esiste un'enità cliente con l'id richiesto
		boolean flag = service.existsClienteById(id);
		if(!flag) {
			return new ResponseEntity<ClienteInfo>(HttpStatus.NOT_FOUND);//cliente non trovato
		}
		Cliente cl = service.getClienteById(id);
		ClienteInfo info = new ClienteInfo();
		BeanUtils.copyProperties(cl, info);
		return new ResponseEntity<ClienteInfo>(info,HttpStatus.OK);
	}

}
