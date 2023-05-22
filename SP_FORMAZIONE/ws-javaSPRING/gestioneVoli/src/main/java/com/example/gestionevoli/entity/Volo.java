package com.example.gestionevoli.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "volo")
public class Volo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "idvolo")
	private String idVolo;
	
	@Column(name="orapartenza")
	private String oraPartenza;
	
	@Column(name="oraarrivo")
	private String oraArrivo;
	
	@Column(name="luogopartenza")
	private String luogoPartenza;
	
	@Column(name="luogoarrivo")
	private String luogoArrivo;

	public String getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(String idVolo) {
		this.idVolo = idVolo;
	}

	public String getOraPartenza() {
		return oraPartenza;
	}

	public void setOraPartenza(String oraPartenza) {
		this.oraPartenza = oraPartenza;
	}

	public String getOraArrivo() {
		return oraArrivo;
	}

	public void setOraArrivo(String oraArrivo) {
		this.oraArrivo = oraArrivo;
	}

	public String getLuogoPartenza() {
		return luogoPartenza;
	}

	public void setLuogoPartenza(String luogoPartenza) {
		this.luogoPartenza = luogoPartenza;
	}

	public String getLuogoArrivo() {
		return luogoArrivo;
	}

	public void setLuogoArrivo(String luogoArrivo) {
		this.luogoArrivo = luogoArrivo;
	}
	

}
