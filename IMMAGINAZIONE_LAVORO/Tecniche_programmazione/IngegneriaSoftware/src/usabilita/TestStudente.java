package usabilita;

import java.util.ArrayList;

public class TestStudente {
	
	public static void main(String[] args) {
		
		/*
		 * Infine, creiamo una classe "Main" che contiene il metodo "main" per eseguire il programma.
		 * In questo esempio, creiamo un elenco di studenti, aggiungiamo alcuni studenti all'elenco,
		 * li rimuoviamo e quindi stampiamo l'elenco completo
		 */
		
		ArrayList<Studente> studenti = new ArrayList<>();
		
		Studente s1 = new Studente("Mario","Rossi",25);
		Studente s2 = new Studente("Paola","Bianchi",30);
		Studente s3 = new Studente("Antonello","Franocsi",23);

		ElencoStudenti elenco = new ElencoStudenti(studenti);
		
		//aggiungi alla lista
		elenco.aggiungiStudente(s1);
		elenco.aggiungiStudente(s1);
		elenco.aggiungiStudente(s1);

		//rimuovi dalla lista
		elenco.rimuoviStudente(s1);
		
		//stampa lista
		elenco.stampaElenco();
		
		
		/*
		 * Questo esempio dimostra l'usabilità del codice Java perché è facile da leggere, 
		 * comprendere e modificare. Inoltre, le classi sono strutturate in modo logico e separato,
		 *  il che rende più semplice la gestione dei dati e la manutenzione del codice. 
		*/
		
	}
}
