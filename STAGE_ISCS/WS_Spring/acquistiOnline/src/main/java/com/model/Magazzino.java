package com.model;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="magazzini")
@CrossOrigin
public class Magazzino {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="id_magazzino")
	private String idmagazzino;
	
	@Column(name="qt_disp")
	private int qt_disponibile;
	
	@Column(name="cod_articolo")
	private String codarticolo;
	
	@Column(name="nome_articolo")
	private String nome_articolo;
	
	@Column(name="prezzo_unitario")
	private double prezzo_unitario;
	
	@Column (name="descrizione")
	private String descrizione;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getId_magazzino() {
		return idmagazzino;
	}

	public void setId_magazzino(String id_magazzino) {
		this.idmagazzino = id_magazzino;
	}

	public int getQt_disponibile() {
		return qt_disponibile;
	}

	public void setQt_disponibile(int qt_disponibile) {
		this.qt_disponibile = qt_disponibile;
	}

	public String getCod_articolo() {
		return codarticolo;
	}

	public void setCod_articolo(String cod_articolo) {
		this.codarticolo = cod_articolo;
	}

	public String getNome_articolo() {
		return nome_articolo;
	}

	public void setNome_articolo(String nome_articolo) {
		this.nome_articolo = nome_articolo;
	}

	public double getPrezzo_unitario() {
		return prezzo_unitario;
	}

	public void setPrezzo_unitario(double prezzo_unitario) {
		this.prezzo_unitario = prezzo_unitario;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
}