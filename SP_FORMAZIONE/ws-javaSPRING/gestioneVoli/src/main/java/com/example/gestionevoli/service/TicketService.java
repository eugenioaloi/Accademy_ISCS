package com.example.gestionevoli.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestionevoli.entity.Ticket;
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
	public boolean existById(String ticketId) {
		return repo.existsById(ticketId);
	}

	@Override
	public Ticket getTicketById(String ticketId) {
		return repo.findById(ticketId).get();
	}

	@Override
	public boolean addTicket(Ticket tk) {
		if(existById(tk.getIdTicket())) {
			return false;
		}else {
			repo.save(tk);
			return true;
		}
	}

	@Override
	public void updateTicket(Ticket tk) {
		repo.save(tk);
	}

	@Override
	public void deleteTicket(Ticket tk) {
		repo.delete(tk);
	}

}
