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
@RequestMapping(value="gestionebiglietteria")
@CrossOrigin
public class ClienteController {
	
	@Autowired
	private IClienteService service;
	
	// get all Clienti by cod_cliente
	@GetMapping(value="clienti", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ClienteInfo>> getAllClientiByCodCliente(){
		List<Cliente> lst = service.getAllClienti();
		List<ClienteInfo> lstInfo = new ArrayList<>();
		for(Cliente cl:lst) {
			ClienteInfo info = new ClienteInfo();
			BeanUtils.copyProperties(cl, info);
			lstInfo.add(info);
		}
		return new ResponseEntity<List<ClienteInfo>>(lstInfo, HttpStatus.OK);//200
	}
	
	//Cliente by cod_cliente
	@GetMapping(value="cliente/{cod_cliente}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ClienteInfo> getClienteByCodCliente(@PathVariable String cod_cliente){
		boolean flag = service.existsClienteByIdCliente(cod_cliente);
		if(!flag) {//non è stato possibile tornare un Cliente con il cod_cliente passato
			return new ResponseEntity<ClienteInfo>(HttpStatus.NOT_FOUND);//404
		}
		Cliente cl = service.getClienteByIdCliente(cod_cliente);
		ClienteInfo info = new ClienteInfo();
		BeanUtils.copyProperties(cl, info);
		return new ResponseEntity<ClienteInfo>(info, HttpStatus.OK);//200
	}

}
