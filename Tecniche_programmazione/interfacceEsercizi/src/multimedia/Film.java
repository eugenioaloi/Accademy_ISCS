package multimedia;

public class Film extends Multimedia{
	
	protected int numVisualizzazioni;
	
	public Film(String titolo, int durata, int numVisualizzazioni) {
		super(titolo, durata);
		this.numVisualizzazioni = numVisualizzazioni;
	}

	@Override
	void riproduci() {
		System.out.println("Sto riproducendo il film " + titolo + " di " + durata +" min, num Visualizzazioni : " + numVisualizzazioni);
		
	}

}
