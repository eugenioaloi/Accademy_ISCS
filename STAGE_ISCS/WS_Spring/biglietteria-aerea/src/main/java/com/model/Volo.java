package com.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="voli")
public class Volo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="partenza")
	private String partenza;
	
	@Column(name="destinazione")
	private String destinazione;
	
	@Column(name="datavolo")
	private Date datavolo;
	
	@Column(name="orariovolo")
	private String orariovolo;
	
	@Column(name="postidisponibili")
	private int postidisponibili;
	
	@Column(name="nomevolo")
	private String nomevolo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPartenza() {
		return partenza;
	}

	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public Date getDatavolo() {
		return datavolo;
	}

	public void setDatavolo(Date datavolo) {
		this.datavolo = datavolo;
	}

	public String getOrariovolo() {
		return orariovolo;
	}

	public void setOrariovolo(String orariovolo) {
		this.orariovolo = orariovolo;
	}

	public int getPostidisponibili() {
		return postidisponibili;
	}

	public void setPostidisponibili(int postidisponibili) {
		this.postidisponibili = postidisponibili;
	}

	public String getNomevolo() {
		return nomevolo;
	}

	public void setNomevolo(String nomevolo) {
		this.nomevolo = nomevolo;
	}
	
}
