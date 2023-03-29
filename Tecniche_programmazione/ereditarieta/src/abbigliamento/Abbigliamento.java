package abbigliamento;

public abstract class Abbigliamento {
	
	private String taglia;
	protected double prezzo;
	private String colore;
	private int quantita;
	
	public Abbigliamento(String taglia, double prezzo, String colore, int quantita) {
		super();
		this.taglia = taglia;
		this.prezzo = prezzo;
		this.colore = colore;
		this.quantita = quantita;
	}

	abstract double applicaSconto();
	abstract boolean promozione();
	
	public String getTaglia() {
		return taglia;
	}

	public void setTaglia(String taglia) {
		this.taglia = taglia;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	@Override
	public String toString() {
		return ", taglia " + taglia + ", prezzo " + prezzo + ", colore " + colore + ", quantità " + quantita;
	}
	
}
