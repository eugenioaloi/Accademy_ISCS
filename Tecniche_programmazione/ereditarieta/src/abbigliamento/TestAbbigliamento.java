package abbigliamento;

import java.util.ArrayList;

public class TestAbbigliamento {
	public static void main(String[] args) {
		
		Abbigliamento felpa = new Maglia("felpa", "m", 20, "rosso", 3);
		Abbigliamento bermuda = new Pantalone("bermuda", "xl", 20, "beige", 1);
		
		ArrayList<Abbigliamento> ves = new ArrayList<>();
		ves.add(felpa);
		ves.add(bermuda);
		/*
		double tot = 0;
		
		ves.forEach(vestito->{
			System.out.println(vestito);
			double prezzoScontato = vestito.applicaSconto();
			tot += vestito.getQuantita()*prezzoScontato;
		});
		
		System.out.println("Totale speso: " + tot);
		 */
		
		Abbigliamento [] vestiti = {felpa,bermuda};
		
		double totale = 0;
		
		for(Abbigliamento vestito: vestiti) {
			System.out.println(vestito);
			double prezzoScontato = vestito.applicaSconto();
			totale += vestito.getQuantita()*prezzoScontato;
		}
		
		System.out.println("Totale speso: " + totale);
		
	}
}
