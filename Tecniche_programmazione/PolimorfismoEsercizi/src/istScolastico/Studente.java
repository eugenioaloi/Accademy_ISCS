package istScolastico;

import java.util.ArrayList;

import persona.Persona;

public class Studente extends Persona{
	
	static int matricola = 0;
	private int matricolaStudente;
	private ArrayList<Voto> voti = new ArrayList<>();
	
	public Studente(String nome, String cognome, String sesso, int eta) {
		super(nome, cognome, eta);
		matricola ++;
		this.matricolaStudente = matricola;
	}
	
	public void ottieniVoto(Voto v) {
		voti.add(v);
	}
	
	public double mediaVoti(){
		double sum = 0;
		for(Voto v: voti) {
			sum += v.getVoto();
		}
		return sum/voti.size();
	}

	@Override
	public String toString() {
		return getNome() +" matricola:" + matricola + " Voti: "+   voti;
	}

}
