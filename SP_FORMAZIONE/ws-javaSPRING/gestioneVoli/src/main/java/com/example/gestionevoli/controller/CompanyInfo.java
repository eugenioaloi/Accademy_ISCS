package com.example.gestionevoli.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class CompanyInfo {
	
	@JsonInclude(Include.NON_NULL)
	private String idcompagnia;
	
	@JsonInclude(Include.NON_NULL)
	private String nome;
	
	@JsonInclude(Include.NON_NULL)
	private String nazione;
	
	@JsonInclude(Include.NON_NULL)
	private String hub;

	public String getidcompagnia() {
		return idcompagnia;
	}

	public void setidcompagnia(String idcompagnia) {
		this.idcompagnia = idcompagnia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public String getHub() {
		return hub;
	}

	public void setHub(String hub) {
		this.hub = hub;
	}
	
	

}
