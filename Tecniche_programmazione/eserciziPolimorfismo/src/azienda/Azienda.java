package azienda;

import java.util.ArrayList;

public class Azienda {
	
	private String ragioneSociale, citta, nome;
	private ArrayList<Dipendente> dipendenti=new ArrayList<>();
	
	public Azienda(String nome, String ragioneSociale, String citta ) {
		this.nome = nome;
		this.ragioneSociale = ragioneSociale;
		this.citta = citta;
	}

	public void assumi(Dipendente d) {
		dipendenti.add(d);
	}
	
	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Azienda " + nome + " - elenco dipendenti: "  + dipendenti;
	}

}
