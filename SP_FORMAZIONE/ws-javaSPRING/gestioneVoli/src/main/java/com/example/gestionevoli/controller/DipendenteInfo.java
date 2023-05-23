package com.example.gestionevoli.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.persistence.Column;

public class DipendenteInfo {
	
	@JsonInclude(Include.NON_NULL)
	private String matricola;
	
	@JsonInclude(Include.NON_NULL)
	private String nome;
	
	@JsonInclude(Include.NON_NULL)
	private String cognome;
	
	@JsonInclude(Include.NON_NULL)
	private int mansione;

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getMansione() {
		return mansione;
	}

	public void setMansione(int mansione) {
		this.mansione = mansione;
	}
	
}
