package com.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carrelli")
public class Carrello {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="cod_cliente")
	private String codCliente;
	
	@Column(name="tipo_pagamento")
	private String tipo_pagamento;
	
	@Column(name="qt_articoli")
	private int qt_articoli;
	
	
	@Column(name="cod_articolo")
	private String codarticolo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCod_cliente() {
		return codCliente;
	}

	public void setCod_cliente(String cod_cliente) {
		this.codCliente = cod_cliente;
	}

	public String getTipo_pagamento() {
		return tipo_pagamento;
	}

	public void setTipo_pagamento(String tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}

	public int getQt_articoli() {
		return qt_articoli;
	}

	public void setQt_articoli(int qt_articoli) {
		this.qt_articoli = qt_articoli;
	}

	public String getCod_articolo() {
		return codarticolo;
	}

	public void setCod_articolo(String cod_articolo) {
		this.codarticolo = cod_articolo;
	}
}
