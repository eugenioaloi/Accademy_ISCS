package com.example.gestionevoli.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestionevoli.entity.Ticket;
import com.example.gestionevoli.entity.TicketID;
import com.example.gestionevoli.errors.EntityNotFoundException;
import com.example.gestionevoli.repository.TicketRepository;

public class TicketService implements ITicketService {
	
	@Autowired
	private TicketRepository repo;

	@Override
	public List<Ticket> getAllTicket() {
		List<Ticket> lst = new ArrayList<>();
		repo.findAll().forEach(tk->lst.add(tk));
		return lst;
	}

	@Override
	public boolean existById(String ticketId, String clientId) {
		return repo.existsById(new TicketID(ticketId, clientId));
	}

	@Override
	public Ticket getTicketById(String ticketId, String clienteId) {
		Ticket tk =  repo
		.findById(new TicketID(ticketId,clienteId))
		.orElseThrow(()->new EntityNotFoundException("Ticket non trovato con id: " + ticketId + 
				" e idCliente " + clienteId));
		return tk;
	}

	@Override
	public boolean addTicket(Ticket tk) {
		if(repo.existsById(new TicketID(tk.getIdTicket(), tk.getIdCliente()))) {
			return false;
		}else {
			repo.save(tk);
			return true;
		}
	}

	@Override
	public boolean updateTicket(Ticket tk) {
		boolean flag = repo.existsById(new TicketID(tk.getIdTicket(),
				tk.getIdCliente()));
		if(!flag) {
			return false;
		}
		repo.save(tk);
		return true;
	}

	@Override
	public boolean deleteTicket(String ticketId, String clienteId) {
		boolean flag = repo.existsById(new TicketID(ticketId, clienteId));
		if(!flag) {
			return false;
		}
		repo.deleteById(new TicketID(ticketId, clienteId));
		return true;
	}


}
