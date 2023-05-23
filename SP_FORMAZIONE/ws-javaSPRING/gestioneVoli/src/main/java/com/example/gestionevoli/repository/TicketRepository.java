package com.example.gestionevoli.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.gestionevoli.entity.Ticket;
import com.example.gestionevoli.entity.TicketID;

public interface TicketRepository extends CrudRepository<Ticket, TicketID>{

	List<Ticket> getTicketbyIdTicket(String idTicket);
	List<Ticket> getTicketbyIdCliente(String idCliente);
	
}
