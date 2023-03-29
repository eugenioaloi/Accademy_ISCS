package abbigliamento;

public class Pantalone extends Abbigliamento {
	
	String modello;

	public Pantalone(String modello,String taglia, double prezzo, String colore, int quantita ) {
		super(taglia, prezzo, colore, quantita);
		this.modello = modello;
	}

	@Override
	double applicaSconto() {
		if(promozione()) {
			double prezzoFinale = prezzo-(prezzo*0.2);
			return prezzoFinale;
		}else {
			System.out.println("Sconto non applicato");
			return prezzo;
		}
	}
	
	@Override
	boolean promozione() {
		return modello.equalsIgnoreCase("bermuda")&&getTaglia().equalsIgnoreCase("xl");
	}
	
	@Override
	public String toString() {
		return modello+ " " + super.toString();
	}

}
