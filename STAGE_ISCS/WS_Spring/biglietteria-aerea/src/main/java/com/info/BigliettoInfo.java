package com.info;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class BigliettoInfo {
	
	@JsonInclude(Include.NON_NULL)
	private int id;
	
	@JsonInclude(Include.NON_NULL)
	private String codcliente;
	
	@JsonInclude(Include.NON_NULL)
	private String tipopagamento;
	
	@JsonInclude(Include.NON_NULL)
	private int qtbiglietti;
	
	@JsonInclude(Include.NON_NULL)
	private int idvolo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodcliente() {
		return codcliente;
	}

	public void setCodcliente(String codcliente) {
		this.codcliente = codcliente;
	}

	public String getTipopagamento() {
		return tipopagamento;
	}

	public void setTipopagamento(String tipopagamento) {
		this.tipopagamento = tipopagamento;
	}

	public int getQtbiglietti() {
		return qtbiglietti;
	}

	public void setQtbiglietti(int qtbiglietti) {
		this.qtbiglietti = qtbiglietti;
	}

	public int getIdvolo() {
		return idvolo;
	}

	public void setIdvolo(int idvolo) {
		this.idvolo = idvolo;
	}
	
}
