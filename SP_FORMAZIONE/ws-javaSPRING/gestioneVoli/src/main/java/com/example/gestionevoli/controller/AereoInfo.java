package com.example.gestionevoli.controller;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class AereoInfo {
	
	@JsonInclude(Include.NON_NULL)
	private String idAereo;
	
	@JsonInclude(Include.NON_NULL)
	private String modello;
	
	@JsonInclude(Include.NON_NULL)
	private int capienza;
	
	@JsonInclude(Include.NON_NULL)
	private Date dataacquisto;

	public String getIdAereo() {
		return idAereo;
	}

	public void setIdAereo(String idAereo) {
		this.idAereo = idAereo;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getCapienza() {
		return capienza;
	}

	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}

	public Date getDataacquisto() {
		return dataacquisto;
	}

	public void setDataacquisto(Date dataacquisto) {
		this.dataacquisto = dataacquisto;
	}
	
}
