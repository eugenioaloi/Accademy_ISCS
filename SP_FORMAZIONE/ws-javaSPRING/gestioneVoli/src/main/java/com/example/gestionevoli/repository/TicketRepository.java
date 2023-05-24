package com.example.gestionevoli.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.gestionevoli.entity.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, String>{
	
}
