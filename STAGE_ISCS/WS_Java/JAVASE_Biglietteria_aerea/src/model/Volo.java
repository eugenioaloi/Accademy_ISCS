package model;

import java.util.Date;

public class Volo {
	
	private String idVolo;

	private String partenza;

	private String destinazione;

	private Date dataVolo;

	private String orarioVolo;

	private int postiDisp;

	private String nomeVolo;

	public Volo(String idVolo, String partenza, String destinazione, Date dataVolo, String orarioVolo, int postiDisp,
			String nomeVolo) {
		this.idVolo = idVolo;
		this.partenza = partenza;
		this.destinazione = destinazione;
		this.dataVolo = dataVolo;
		this.orarioVolo = orarioVolo;
		this.postiDisp = postiDisp;
		this.nomeVolo = nomeVolo;
	}

	public String getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(String idVolo) {
		this.idVolo = idVolo;
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

	public Date getDataVolo() {
		return dataVolo;
	}

	public void setDataVolo(Date dataVolo) {
		this.dataVolo = dataVolo;
	}

	public String getOrarioVolo() {
		return orarioVolo;
	}

	public void setOrarioVolo(String orarioVolo) {
		this.orarioVolo = orarioVolo;
	}

	public int getPostiDisp() {
		return postiDisp;
	}

	public void setPostiDisp(int postiDisp) {
		this.postiDisp = postiDisp;
	}

	public String getNomeVolo() {
		return nomeVolo;
	}

	public void setNomeVolo(String nomeVolo) {
		this.nomeVolo = nomeVolo;
	}

	@Override
	public String toString() {
		return "Volo [idVolo=" + idVolo + ", partenza=" + partenza + ", destinazione=" + destinazione + ", dataVolo="
				+ dataVolo + ", orarioVolo=" + orarioVolo + ", postiDisp=" + postiDisp + ", nomeVolo=" + nomeVolo + "]";
	}
	
}
