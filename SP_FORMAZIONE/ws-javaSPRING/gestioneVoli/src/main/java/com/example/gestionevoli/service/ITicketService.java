package com.example.gestionevoli.service;

import java.util.List;

import com.example.gestionevoli.entity.Ticket;

public interface ITicketService {
	
	//getAll- LIST
	public List<Ticket> getAllTicket();
	
	//existById- boolean
	public boolean existById(String ticketId);
	
	//getTicketById - Ticket
	public Ticket getTicketById(String ticketId);
	
	//addTicket - boolean
	public boolean addTicket(Ticket tk);
	
	//updateTicket - void
	public void updateTicket(Ticket tk);
	
	//deleteTicket - void
	public void deleteTicket(Ticket tk);
	

}
