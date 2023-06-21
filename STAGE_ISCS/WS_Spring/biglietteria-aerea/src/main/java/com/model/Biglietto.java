package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="biglietti")
public class Biglietto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="codcliente")
	private String codcliente;
	
	@Column(name="tipopagamento")
	private String tipopagamento;
	
	@Column(name="qtbiglietti")
	private int qtbiglietti;
	
	@Column(name="id_volo")
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
