package negozio;

public class Prodotto {
	
	private int codice;
	private String desc;
	protected double prezzo;
	Cliente c;
	
	public Prodotto(int codice, String desc, double prezzo, Cliente c) {
		this.codice = codice;
		this.desc = desc;
		this.prezzo = prezzo;
		this.c = c;
	}
	
	public void applicaSconto() {
		if(c.getEta()>60) {
			prezzo=prezzo-((prezzo*5)/100);
		}
	}

	@Override
	public String toString() {
		return "Prodotto [codice=" + codice + ", desc=" + desc + ", prezzo=" + prezzo + "]";
	}
	
}
