package com.info;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class SpettacoloInfo {

	@JsonInclude(Include.NON_NULL)
	private int id;
	
	@JsonInclude(Include.NON_NULL)
	private String luogo;
	
	@JsonInclude(Include.NON_NULL)
	private String gruppo;

	@JsonInclude(Include.NON_NULL)
	private Date dataconcerto;
	
	@JsonInclude(Include.NON_NULL)
	private String nomeconcerto;
	
	@JsonInclude(Include.NON_NULL)
	private int capienza;
	
	@JsonInclude(Include.NON_NULL)
	private int biglietto_id;

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
		return biglietto_id;
	}

	public void setBiglietto_id(int biglietto_id) {
		this.biglietto_id = biglietto_id;
	}
	
}
