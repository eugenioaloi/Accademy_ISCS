package abbigliamento;

public class Maglia extends Abbigliamento{
	
	String tipo;

	public Maglia(String tipo,String taglia, double prezzo, String colore, int quantita) {
		super(taglia, prezzo, colore, quantita);
		this.tipo = tipo;
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
		return getQuantita()>2&&getColore().equalsIgnoreCase("rosso")&&tipo.equalsIgnoreCase("felpa");
	}
	
	@Override
	public String toString() {
		return " Tipo=" + tipo + super.toString();
	}

}
