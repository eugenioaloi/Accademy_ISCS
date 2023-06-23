package com.info;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class VoloInfo {

	@JsonInclude(Include.NON_NULL)
	private int id;
	
	@JsonInclude(Include.NON_NULL)
	private String nomevolo;
	
	@JsonInclude(Include.NON_NULL)
	private String partenza;
	
	@JsonInclude(Include.NON_NULL)
	private String destinazione;
	
	@JsonInclude(Include.NON_NULL)
	private Date datavolo;
	
	@JsonInclude(Include.NON_NULL)
	private String orapartenza;
	
	@JsonInclude(Include.NON_NULL)
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
