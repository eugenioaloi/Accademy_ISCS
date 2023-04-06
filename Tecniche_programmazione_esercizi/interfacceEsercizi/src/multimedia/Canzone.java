package multimedia;

public class Canzone extends Multimedia {
	
	protected String autore;
	
	public Canzone(String titolo, int durata, String autore) {
		super(titolo, durata);
		this.autore = autore;
	}

	@Override
	void riproduci() {
		System.out.println("Sto riproducendo la canzone " + titolo + " di " + durata +" min, autore : " + autore);
	}

}
