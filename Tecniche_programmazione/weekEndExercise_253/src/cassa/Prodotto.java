package cassa;

public class Prodotto {
	
	private String codBarre, descrizione;
	private double prezzo;
	
	public Prodotto(String codBarre, String descrizione, double prezzo) {
		this.codBarre = codBarre;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	public String getCodBarre() {
		return codBarre;
	}

	public void setCodBarre(String codBarre) {
		this.codBarre = codBarre;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return descrizione;
	}

}
