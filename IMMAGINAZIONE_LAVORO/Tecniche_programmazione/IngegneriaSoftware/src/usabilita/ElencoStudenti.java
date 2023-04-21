package usabilita;

import java.util.ArrayList;

public class ElencoStudenti {
	
	/*
	 *  Ora creiamo una classe "ElencoStudenti" che rappresenta l'elenco di tutti gli studenti.
	 *  Questa classe avrà un'arraylist di oggetti "Studente" e metodi per aggiungere, 
	 *  rimuovere e recuperare gli studenti dall'elenco
	 */
	
	ArrayList<Studente> studenti = new ArrayList<>();
	
	public ElencoStudenti(ArrayList<Studente> studenti) {
		this.studenti = studenti;
	}

	public void aggiungiStudente(Studente s) {
		studenti.add(s);
	}
	
	public void rimuoviStudente(Studente s) {
		studenti.remove(s);
	}
	
	public void stampaElenco() {
		for(Studente s: studenti) {
			System.out.println(s);
		}
	}
	

}
