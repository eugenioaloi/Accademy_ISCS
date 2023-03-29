package multimedia;

public abstract class Multimedia {
	
	String titolo;
	int durata;
	
	public Multimedia(String titolo, int durata) {
		this.titolo = titolo;
		this.durata = durata;
	}

	abstract void riproduci();

	@Override
	public String toString() {
		return "Titolo= " + titolo + ", durata= " + durata + " min";
	}

}
