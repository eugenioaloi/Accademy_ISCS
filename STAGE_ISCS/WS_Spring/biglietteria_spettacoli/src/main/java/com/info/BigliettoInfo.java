package com.info;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class BigliettoInfo {
	
	@JsonInclude(Include.NON_NULL)
	private int id;
	
	@JsonInclude(Include.NON_NULL)
	private String orario;
	
	@JsonInclude(Include.NON_NULL)
	private String codbiglietto;
	
	@JsonInclude(Include.NON_NULL)
	private String codspettacolo;
	
	@JsonInclude(Include.NON_NULL)
	private double prezzo;
	
	@JsonInclude(Include.NON_NULL)
	private int quantita;
	
	@JsonInclude(Include.NON_NULL)
	private String tipopagamento;
	
	@JsonInclude(Include.NON_NULL)
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
