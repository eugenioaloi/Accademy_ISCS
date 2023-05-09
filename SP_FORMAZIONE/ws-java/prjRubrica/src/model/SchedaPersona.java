package model;

import service.ISchedaPersona;

public class SchedaPersona implements ISchedaPersona {
	
	private String nome;// contiene il nome e cognome
	private String indirizzo;
	private String num_telefono; 

	public SchedaPersona() {}
	
	public SchedaPersona(String nome, String indirizzo, String num_telefono) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.num_telefono = num_telefono;
	}

	@Override
	public boolean equals(Object s) {
		SchedaPersona sp = new SchedaPersona(nome,indirizzo,num_telefono);
		if(s instanceof SchedaPersona) {
			String str = s.toString();
			if (sp.contains(str)){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean contains(String s) {
		if(s.indexOf(nome)>=0) {
			return true;
		}
		if(s.indexOf(indirizzo)>=0) {
			return true;
		}
		if(s.indexOf(num_telefono)>=0) {
			return true;
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
		return nome + indirizzo + num_telefono ;
	}
	
}
