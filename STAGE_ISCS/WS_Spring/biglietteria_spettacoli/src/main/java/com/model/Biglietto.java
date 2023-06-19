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
	@Column(name = "id")
	private int id;
	
	@Column(name = "orario")
	private String orario;
	
	@Column(name = "cod_spettacolo")
	private String codspettacolo;
	
	@Column(name = "cod_biglietto")
	private String codbiglietto;
	
	@Column(name = "prezzo")
	private double prezzo;
	
	@Column(name = "quantita")
	private int quantita;
	
	@Column(name = "tipo_pagamento")
	private String tipopagamento;
	
	@Column(name = "cod_cliente")
	private String codcliente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrario() {
		return orario;
	}

	public void setOrario(String orario) {
		this.orario = orario;
	}

	public String getCodspettacolo() {
		return codspettacolo;
	}

	public void setCodspettacolo(String codspettacolo) {
		this.codspettacolo = codspettacolo;
	}

	public String getCodbiglietto() {
		return codbiglietto;
	}

	public void setCodbiglietto(String codbiglietto) {
		this.codbiglietto = codbiglietto;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public String getTipopagamento() {
		return tipopagamento;
	}

	public void setTipopagamento(String tipopagamento) {
		this.tipopagamento = tipopagamento;
	}

	public String getCodcliente() {
		return codcliente;
	}

	public void setCodcliente(String codcliente) {
		this.codcliente = codcliente;
	}
	
}
