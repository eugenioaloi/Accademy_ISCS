package model;

public class Biglietto {
	
	private int codOperazione;

	private String codCliente;

	private String tipoPagamento;

	private int qtBiglietti;

	private String idVolo;

	public Biglietto(int codOperazione, String codCliente, String tipoPagamento, int qtBiglietti, String idVolo) {
		this.codOperazione = codOperazione;
		this.codCliente = codCliente;
		this.tipoPagamento = tipoPagamento;
		this.qtBiglietti = qtBiglietti;
		this.idVolo = idVolo;
	}
	
	public Biglietto(String codCliente, String tipoPagamento, int qtBiglietti, String idVolo) {
		this.codCliente = codCliente;
		this.tipoPagamento = tipoPagamento;
		this.qtBiglietti = qtBiglietti;
		this.idVolo = idVolo;
	}

	public int getCodOperazione() {
		return codOperazione;
	}

	public void setCodOperazione(int codOperazione) {
		this.codOperazione = codOperazione;
	}

	public String getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public int getQtBiglietti() {
		return qtBiglietti;
	}

	public void setQtBiglietti(int qtBiglietti) {
		this.qtBiglietti = qtBiglietti;
	}

	public String getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(String idVolo) {
		this.idVolo = idVolo;
	}

	@Override
	public String toString() {
		return "Volo [codOperazione=" + codOperazione + ", codCliente=" + codCliente + ", tipoPagamento="
				+ tipoPagamento + ", qtBiglietti=" + qtBiglietti + ", idVolo=" + idVolo + "]";
	}
	
}
