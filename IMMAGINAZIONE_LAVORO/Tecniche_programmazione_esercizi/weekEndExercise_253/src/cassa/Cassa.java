package cassa;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Cassa {
	
	public String leggiProdotto(Prodotto p) {
		return p.getCodBarre();
	}
	
	public void stampaScontrino(ArrayList<Prodotto> spesa, Date d) {
		double totSpesa = 0;
		ArrayList<Prodotto> carrello = new ArrayList<>();
		for(Prodotto p:spesa) {
			carrello.add(p);
			totSpesa += p.getPrezzo();
		}

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Il totale della spesa fatta il " + df.format(d) + " è di: " + totSpesa + " € \n" +
				"I prodotti acquistati sono: " + carrello.toString());
	}

}
