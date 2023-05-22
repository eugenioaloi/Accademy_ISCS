package com.example.gestionevoli.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aereoporto")
public class Aereoporto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idAereoporto")
	private String idAereoporto;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "citta")
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
