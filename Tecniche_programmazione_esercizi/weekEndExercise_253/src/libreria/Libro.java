package libreria;

public class Libro {
	
	/*
	 * @params titolo
	 * @params autore
	 * @params prezzo
	 * */
	private String titolo,autore;
	private double prezzo;
	
	public Libro(String titolo, String autore, double prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", prezzo=" + prezzo + "]";
	}

}
