package libreria;

import java.util.ArrayList;

public class Libreria {
	
	/*
	 * metodo che trova i libri in un arraylist di Libro in base all'autore
	 * @param autore, l'autore che voglio cercare
	 * @param scaffale, l'arraylist di tipo Libro sul quale fare la ricerca in base all'autore
	 * */
	public void trova(String autore, ArrayList<Libro> scaffale) {
		for(Libro libri:scaffale) {
			if(libri.getAutore().toLowerCase().contentEquals(autore.toLowerCase())) {
				System.out.println(libri.getTitolo());
			}
		}
	}

}
