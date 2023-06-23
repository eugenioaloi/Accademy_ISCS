package com.info;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class BigliettoInfo {
	
	@JsonInclude(Include.NON_NULL)
	private int id;
	
	@JsonInclude(Include.NON_NULL)
	private String tipopagamento;
	
	@JsonInclude(Include.NON_NULL)
	private int qtrichiesta;
	
	@JsonInclude(Include.NON_NULL)
	private int clienteid;
	
	@JsonInclude(Include.NON_NULL)
	private int voloid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipopagamento() {
		return tipopagamento;
	}

	public void setTipopagamento(String tipopagamento) {
		this.tipopagamento = tipopagamento;
	}

	public int getQtrichiesta() {
		return qtrichiesta;
	}

	public void setQtrichiesta(int qtrichiesta) {
		this.qtrichiesta = qtrichiesta;
	}

	public int getClienteid() {
		return clienteid;
	}

	public void setClienteid(int clienteid) {
		this.clienteid = clienteid;
	}

	public int getVoloid() {
		return voloid;
	}

	public void setVoloid(int voloid) {
		this.voloid = voloid;
	}
	
}
