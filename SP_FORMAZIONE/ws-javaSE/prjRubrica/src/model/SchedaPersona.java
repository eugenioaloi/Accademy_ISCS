package model;

import service.ISchedaPersona;

public class SchedaPersona implements ISchedaPersona {
	
	private String nome;// contiene il nome e cognome
	private String indirizzo;
	private String num_telefono; 
	
	public SchedaPersona() {};
	
	public SchedaPersona(String nome, String indirizzo, String num_telefono) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.num_telefono = num_telefono;
	}
	
	@Override
	public boolean contains(String s) {
		String sUpper = s.toUpperCase();
		
		if(nome.toUpperCase().contains(sUpper)
				|| indirizzo.toUpperCase().contains(sUpper)
				|| num_telefono.toUpperCase().contains(sUpper))
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean equals(Object s) {
		if(s instanceof SchedaPersona) {
			SchedaPersona sp = (SchedaPersona) s;
			if(contains(sp.nome)
				||contains(sp.indirizzo)
				||contains(sp.num_telefono)) {
					return true;
			}
		}
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getNum_telefono() {
		return num_telefono;
	}

	public void setNum_telefono(String num_telefono) {
		this.num_telefono = num_telefono;
	}

	@Override
	public String toString() {
		return nome + " " + indirizzo + " " + num_telefono ;
	}
	
}
