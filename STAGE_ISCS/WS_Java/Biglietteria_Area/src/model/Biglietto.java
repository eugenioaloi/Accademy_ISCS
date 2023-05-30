package model;

public class Biglietto {
	
	private int cod_operazione;
	private String cod_cliente;
	private String tipo_pagamento;
	private int qt_biglietti;
	private String id_volo;
	
	public Biglietto() {}

	public Biglietto(int cod_operazione, String cod_cliente, String tipo_pagamento, int qt_biglietti, String id_volo) {
		super();
		this.cod_operazione = cod_operazione;
		this.cod_cliente = cod_cliente;
		this.tipo_pagamento = tipo_pagamento;
		this.qt_biglietti = qt_biglietti;
		this.id_volo = id_volo;
	}

	public int getCod_operazione() {
		return cod_operazione;
	}

	public void setCod_operazione(int cod_operazione) {
		this.cod_operazione = cod_operazione;
	}

	public String getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(String cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public String getTipo_pagamento() {
		return tipo_pagamento;
	}

	public void setTipo_pagamento(String tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}

	public int getQt_biglietti() {
		return qt_biglietti;
	}

	public void setQt_biglietti(int qt_biglietti) {
		this.qt_biglietti = qt_biglietti;
	}

	public String getId_volo() {
		return id_volo;
	}

	public void setId_volo(String id_volo) {
		this.id_volo = id_volo;
	}

	@Override
	public String toString() {
		return "Biglietto [cod_operazione=" + cod_operazione + ", cod_cliente=" + cod_cliente + ", tipo_pagamento="
				+ tipo_pagamento + ", qt_biglietti=" + qt_biglietti + ", id_volo=" + id_volo + "]";
	};
	
}
