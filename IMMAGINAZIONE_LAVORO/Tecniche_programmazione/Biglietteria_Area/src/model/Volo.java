package model;

import java.util.Date;

public class Volo {
	
	private String id_volo;
	private String partenza;
	private String destinazione;
	private Date data_volo;
	private String orario_volo;
	private int posti_disp;
	private String nome_volo;
	
	public Volo() {};
	
	public Volo(String id_volo, String partenza, String destinazione, Date data_volo, String orario_volo,
			int posti_disp, String nome_volo) {
		super();
		this.id_volo = id_volo;
		this.partenza = partenza;
		this.destinazione = destinazione;
		this.data_volo = data_volo;
		this.orario_volo = orario_volo;
		this.posti_disp = posti_disp;
		this.nome_volo = nome_volo;
	}
	
	public String getId_volo() {
		return id_volo;
	}
	public void setId_volo(String id_volo) {
		this.id_volo = id_volo;
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
	public Date getData_volo() {
		return data_volo;
	}
	public void setData_volo(Date data_volo) {
		this.data_volo = data_volo;
	}
	public String getOrario_volo() {
		return orario_volo;
	}
	public void setOrario_volo(String orario_volo) {
		this.orario_volo = orario_volo;
	}
	public int getPosti_disp() {
		return posti_disp;
	}
	public void setPosti_disp(int posti_disp) {
		this.posti_disp = posti_disp;
	}
	public String getNome_volo() {
		return nome_volo;
	}
	public void setNome_volo(String nome_volo) {
		this.nome_volo = nome_volo;
	}

	@Override
	public String toString() {
		return "Volo [id_volo=" + id_volo + ", partenza=" + partenza + ", destinazione=" + destinazione + ", data_volo="
				+ data_volo + ", orario_volo=" + orario_volo + ", posti_disp=" + posti_disp + ", nome_volo=" + nome_volo
				+ "]";
	}
	
	
	

}
