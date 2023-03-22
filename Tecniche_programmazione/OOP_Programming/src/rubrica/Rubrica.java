package rubrica;

import java.util.HashMap;

public class Rubrica {
	
	//una rubrica è composta da persone e da un array di numeri
	private HashMap<String, Integer[]> rubrica = new HashMap<>();
	
	//i metodi prevodono una chiamata in base all'entrata fatta dall'utente
		
	//-1 inserisci persona e numeri di telefono
	public void inserisci(String persona, int [] numeri) {
		
	}
	
	//-2 cancella una persona 
	public void cancella() {
		
	}
	

	//-3 ricercare una persona
	public void ricerca() {
		
	}
	
	//-4 stampare l'elenco
	public void stampa() {
		
	}
	
	//5- esce dal programma
	public void esci() 
	{}
	
	
	public HashMap<String, Integer[]> getRubrica() {
		return rubrica;
	}
	
	public void setRubrica(HashMap<String, Integer[]> rubrica) {
		this.rubrica = rubrica;
	}
	

}
