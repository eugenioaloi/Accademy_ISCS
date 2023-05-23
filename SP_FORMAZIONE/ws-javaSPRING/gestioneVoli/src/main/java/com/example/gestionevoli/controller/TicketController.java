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

import com.example.gestionevoli.entity.Aereo;
import com.example.gestionevoli.entity.Ticket;
import com.example.gestionevoli.errors.EntityNotFoundException;
import com.example.gestionevoli.service.IAereoService;
import com.example.gestionevoli.service.ITicketService;

@RestController
@RequestMapping("gestioneCompagnia")
@CrossOrigin
public class TicketController {
	
	@Autowired
	private ITicketService service;
	
	@GetMapping(value="ticket/{idTicket}/{idCliente}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<TicketInfo> getTicketById(@PathVariable("idTicket") String idTicket,
			@PathVariable("idCliente")String idCliente){
		TicketInfo info = new TicketInfo();
		BeanUtils.copyProperties(service.getTicketById(idTicket,idCliente), info);
		return new ResponseEntity<TicketInfo>(info,HttpStatus.OK);
	}

	@GetMapping(value= "ticket", produces = {MediaType.APPLICATION_JSON_VALUE} )
	public ResponseEntity<List<TicketInfo>> getAllAerei(){
		List<TicketInfo> lstInfoticket = new ArrayList<>();
		List<Ticket> lstTicket = service.getAllTicket();
		for (int i = 0; i < lstTicket.size(); i++) {
			TicketInfo info = new TicketInfo();
			BeanUtils.copyProperties(lstTicket.get(i), info);
			lstInfoticket.add(info);
		}
		return new ResponseEntity<List<TicketInfo>>(lstInfoticket,HttpStatus.OK);
	}
	
	@PostMapping(value="ticket", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Void> addAereo(@RequestBody TicketInfo info, UriComponentsBuilder builder){
		Ticket tk = new Ticket();
		BeanUtils.copyProperties(info, tk);
		boolean flag = service.addTicket(tk);
		if(!flag) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("ticket/{id}").buildAndExpand(tk.getIdTicket()).toUri());
		return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
	}
	
	
	

}
