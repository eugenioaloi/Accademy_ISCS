package com.example.gestionevoli.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="compagnia")
public class Company {
	
	@Id
	@Column(name = "idcompagnia")
	private String idcompagnia;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "nazione")
	private String nazione;
	
	@Column(name = "hub")
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
