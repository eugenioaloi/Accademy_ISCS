package com.example.gestionevoli.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {
	
	@Id
	@Column(name ="idticket")
	private String idTicket;

	//@Id
	@Column(name ="idcliente")
	private String idCliente;
	
	@Column(name ="idcompagnia")
	private String idCompagnia;
	
	@Column(name ="idvolo")
	private String idVolo;
	
	@Column(name ="dtemissione")
	private Date dtEmissione;
	
	@Column(name ="prezzo")
	private int prezzo;

	public String getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(String idTicket) {
		this.idTicket = idTicket;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getIdCompagnia() {
		return idCompagnia;
	}

	public void setIdCompagnia(String idCompagnia) {
		this.idCompagnia = idCompagnia;
	}

	public String getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(String idVolo) {
		this.idVolo = idVolo;
	}

	public Date getDtEmissione() {
		return dtEmissione;
	}

	public void setDtEmissione(Date dtEmissione) {
		this.dtEmissione = dtEmissione;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
	

}
