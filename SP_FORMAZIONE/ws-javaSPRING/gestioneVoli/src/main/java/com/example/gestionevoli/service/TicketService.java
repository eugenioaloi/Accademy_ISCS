package com.example.gestionevoli.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestionevoli.entity.Ticket;
import com.example.gestionevoli.entity.TicketID;
import com.example.gestionevoli.errors.EntityNotFoundException;
import com.example.gestionevoli.repository.TicketRepository;

@Service
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
	public boolean existById(String ticketId) {
		return repo.existsById(ticketId);
	}

	@Override
	public Ticket getTicketById(String ticketId) {
		Ticket tk =  repo
		.findById(ticketId)
		.orElseThrow(()->new EntityNotFoundException("Ticket non trovato con id: " + ticketId));
		return tk;
	}

	@Override
	public boolean addTicket(Ticket tk) {
		if(repo.existsById(tk.getIdTicket())) {
			return false;
		}else {
			repo.save(tk);
			return true;
		}
	}

	@Override
	public boolean updateTicket(Ticket tk) {
		boolean flag = repo.existsById(tk.getIdTicket());
		if(!flag) {
			return false;
		}
		repo.save(tk);
		return true;
	}

	@Override
	public boolean deleteTicket(String ticketId) {
		boolean flag = repo.existsById(ticketId);
		if(!flag) {
			return false;
		}
		repo.deleteById(ticketId);
		return true;
	}


}
