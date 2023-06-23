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
	private int id;
	
	@Column(name = "nome_volo")
	private String nomevolo;
	
	@Column(name = "partenza")
	private String partenza;
	
	@Column(name = "destinazione")
	private String destinazione;
	
	@Column(name = "data_volo")
	private Date datavolo;
	
	@Column(name = "ora_partenza")
	private String orapartenza;
	
	@Column(name = "capienza")
	private int capienza;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomevolo() {
		return nomevolo;
	}

	public void setNomevolo(String nomevolo) {
		this.nomevolo = nomevolo;
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

	public String getOrapartenza() {
		return orapartenza;
	}

	public void setOrapartenza(String orapartenza) {
		this.orapartenza = orapartenza;
	}

	public int getCapienza() {
		return capienza;
	}

	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}
	
}
