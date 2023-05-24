package com.example.gestionevoli.service;

import java.util.List;

import com.example.gestionevoli.entity.Ticket;

public interface ITicketService {
	
	//getAll- LIST
	public List<Ticket> getAllTicket();
	
	//existById- boolean
	boolean existById(String ticketId);
	
	//getTicketById - Ticket
	public Ticket getTicketById(String ticketId);
	
	//addTicket - boolean
	public boolean addTicket(Ticket tk);
	
	//updateTicket - boolean
	public boolean updateTicket(Ticket tk);
	
	//deleteTicket - boolean
	public boolean deleteTicket(String ticketId);


	

}
