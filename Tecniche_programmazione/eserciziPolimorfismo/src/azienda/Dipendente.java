package azienda;

import persona.Persona;

public class Dipendente extends Persona {
	
	static int matricola=0;
	private int matricolaDip;
	
	public Dipendente(String nome, String cognome, int eta) {
		super(nome, cognome, eta);
		matricola++;
		this.matricolaDip = matricola;
	}

	public int getMatricolaDip() {
		return matricolaDip;
	}

	public void setMatricolaDip(int matricolaDip) {
		this.matricolaDip = matricolaDip;
	}

	@Override
	public String toString() {
		return "Dipendente" + nome + ", matricola: " + getMatricolaDip();
	}
	
	
	
	
	

}
