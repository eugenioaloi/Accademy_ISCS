package istitutoScolastico;

import java.util.HashMap;

import persona.Persona;

public class Studente extends Persona{
	
	private int matricola;
	
	private HashMap<Studente, Voto> libretto = new HashMap<>();//K: Studente, V: Voto;
	
	public Studente(String nome, String cognome, String sesso, int eta, int matricola) {
		super(nome, cognome, sesso, eta);
		this.matricola = matricola;
	}
	
	public void ottieniVoto(Studente s, Voto v) {
		libretto.put(s,v);
	}
	
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	
	public int getMatricola() {
		return matricola;
	}


}
