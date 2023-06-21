package com.info;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class VoloInfo {

	@JsonInclude(Include.NON_NULL)
	private int id;

	@JsonInclude(Include.NON_NULL)
	private String partenza;
	
	@JsonInclude(Include.NON_NULL)
	private String destinazione;
	
	@JsonInclude(Include.NON_NULL)
	private Date datavolo;
	
	@JsonInclude(Include.NON_NULL)
	private String orariovolo;

	@JsonInclude(Include.NON_NULL)
	private int postidisponibili;
	
	@JsonInclude(Include.NON_NULL)
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
