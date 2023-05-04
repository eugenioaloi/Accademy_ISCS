package contaParole;

import java.util.Map;

public interface IcontaParole {
	
	//Ritorna una mappa con le parole inserite dall'utente
	public Map<String, Integer> chiediParole();
	
	//Stampa il numero di parole univoche inserite dall'utente
	public int stampaNumParole(Map<String, Integer> paroliere);
	
	//Stampa una stringa con le parole digitate dall'utente separate da spazio
	public StringBuilder getParole();
	
	// stampare il numero di occorrenze di ogni parola trovata
	public void numOccorrenzeParole(Map<String, Integer> paroliere);
	
	// stampare le parole con più occorrenze
	public String topParola(Map<String, Integer> paroliere);

}
