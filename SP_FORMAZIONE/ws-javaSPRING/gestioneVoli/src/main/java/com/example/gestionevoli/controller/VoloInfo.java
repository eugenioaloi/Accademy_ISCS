package com.example.gestionevoli.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class VoloInfo {
	
	@JsonInclude(Include.NON_NULL)
	private String idVolo;
	
	@JsonInclude(Include.NON_NULL)
	private String oraPartenza;
	
	@JsonInclude(Include.NON_NULL)
	private String oraArrivo;
	
	@JsonInclude(Include.NON_NULL)
	private String luogoPartenza;
	
	@JsonInclude(Include.NON_NULL)
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
