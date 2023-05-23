package com.example.gestionevoli.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class AereoportoInfo {
	
	@JsonInclude(Include.NON_NULL)
	private String idAereoporto;
	
	@JsonInclude(Include.NON_NULL)
	private String nome;
	
	@JsonInclude(Include.NON_NULL)
	private String citta;

	public String getIdAereoporto() {
		return idAereoporto;
	}

	public void setIdAereoporto(String idAereoporto) {
		this.idAereoporto = idAereoporto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}
	
	

}
