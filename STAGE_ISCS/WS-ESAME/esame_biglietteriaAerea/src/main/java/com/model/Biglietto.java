package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="biglietti")
public class Biglietto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "tipo_pagamento")
	private String tipopagamento;
	
	@Column(name = "qt_richiesta")
	private int qtrichiesta;
	
	@Column(name = "cliente_id")
	private int clienteid;
	
	@Column(name = "volo_id")
	private int voloid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipopagamento() {
		return tipopagamento;
	}

	public void setTipopagamento(String tipopagamento) {
		this.tipopagamento = tipopagamento;
	}

	public int getQtrichiesta() {
		return qtrichiesta;
	}

	public void setQtrichiesta(int qtrichiesta) {
		this.qtrichiesta = qtrichiesta;
	}

	public int getClienteid() {
		return clienteid;
	}

	public void setClienteid(int clienteid) {
		this.clienteid = clienteid;
	}

	public int getVoloid() {
		return voloid;
	}

	public void setVoloid(int voloid) {
		this.voloid = voloid;
	}
	
}
