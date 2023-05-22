package com.example.gestionevoli.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aereo")
public class Aereo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idaereo")
	private String idAereo;
	
	@Column(name="modello")
	private String modello;
	
	@Column(name="capienza")
	private int capienza;
	
	@Column(name="dataacquisto")
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
