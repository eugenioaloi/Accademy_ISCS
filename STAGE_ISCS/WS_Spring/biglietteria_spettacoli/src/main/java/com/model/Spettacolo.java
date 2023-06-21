package com.model;

import java.sql.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="spettacoli")
public class Spettacolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="luogo")
	private String luogo;
	
	@Column(name="gruppo")
	private String gruppo;

	@Column(name="data_concerto")
	private Date dataconcerto;
	
	@Column(name="nome_concerto")
	private String nomeconcerto;
	
	@Column(name="capienza")
	private int capienza;
	
	@Column(name="biglietto_id")
	private int bigliettoid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLuogo() {
		return luogo;
	}

	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}

	public String getGruppo() {
		return gruppo;
	}

	public void setGruppo(String gruppo) {
		this.gruppo = gruppo;
	}

	public Date getDataconcerto() {
		return dataconcerto;
	}

	public void setDataconcerto(Date dataconcerto) {
		this.dataconcerto = dataconcerto;
	}

	public String getNomeconcerto() {
		return nomeconcerto;
	}

	public void setNomeconcerto(String nomeconcerto) {
		this.nomeconcerto = nomeconcerto;
	}

	public int getCapienza() {
		return capienza;
	}

	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}

	public int getBiglietto_id() {
		return bigliettoid;
	}

	public void setBiglietto_id(int bigliettoid) {
		this.bigliettoid = bigliettoid;
	}
	
}
