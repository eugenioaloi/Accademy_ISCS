package istanze;

public class Auto {
	
	/*
	* javadoc, annotazioni custom per commentare il codice
	*/
	private String marca;
	private String modello;
	private int anno;
	private int prezzo;

	/**
	 * params
	 * */
	
	public Auto(String marca, String modello, int anno, int prezzo) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.anno = anno;
		this.prezzo = prezzo;
	}

	/**
	 * metodo per guidare
	 * */
	public void guida() {
		System.out.println("Sto guidando");
	}
	
	/**
	 * metodo per frenare
	 * */
	public void frena() {
		System.out.println("Sto frenando");
	}
	
	@Override
	public String toString() {
		return "Macchine [marca=" + marca + ", modello=" + modello + ", anno=" + anno + ", prezzo=" + prezzo + "]";
	}

	
	//GETTERS AND SETTERS
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
}
