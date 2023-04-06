package negozio;


public class ProdNonAlimentari extends Prodotto{
	
	String materiale;
	
	public ProdNonAlimentari(String materiale, int codice, String desc, double prezzo, Cliente c) {
		super(codice, desc, prezzo, c);
		this.materiale = materiale;
	}

	@Override
	public void applicaSconto() {
		if(materiale.equalsIgnoreCase("carta")||materiale.equalsIgnoreCase("vetro")	) {
			prezzo -= prezzo *0.1;
		}
		super.applicaSconto();//5%
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " materiale: " + materiale;
	}
	
}
