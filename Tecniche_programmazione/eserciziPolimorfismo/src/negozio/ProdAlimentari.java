package negozio;

import java.util.Calendar;

public class ProdAlimentari extends Prodotto{
	
	Calendar dataScadenza, oggi;

	public ProdAlimentari(int codice, String desc, double prezzo, Cliente c, Calendar dataScadenza) {
		super(codice, desc, prezzo, c);
		this.dataScadenza = dataScadenza;
	}
	
	@Override
	public void applicaSconto() {
		
		oggi = Calendar.getInstance();
		
		//86400000 = 10 giorno
		long giorniTra2Date = (dataScadenza.getTimeInMillis()-oggi.getTimeInMillis());
		if(giorniTra2Date<10) {
			prezzo-=prezzo*0.2;
		}
		
		super.applicaSconto();//5%
	}
	
	@Override
	public String toString() {
		return super.toString() + " data scadenza : " + dataScadenza.getTime();
	}
	
}
