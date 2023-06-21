package com.info;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class BigliettoInfo {

	@JsonInclude(Include.NON_NULL)
	private int id;
	
	@JsonInclude(Include.NON_NULL)
	private String orario;
	
	@JsonInclude(Include.NON_NULL)
	private double prezzo;
	
	@JsonInclude(Include.NON_NULL)
	private int quantita;
	
	@JsonInclude(Include.NON_NULL)
	private String tipopagamento;
	
	@JsonInclude(Include.NON_NULL)
	private int clienteid;

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

	public int getClienteid() {
		return clienteid;
	}

	public void setClienteid(int clienteid) {
		this.clienteid = clienteid;
	}
	
}