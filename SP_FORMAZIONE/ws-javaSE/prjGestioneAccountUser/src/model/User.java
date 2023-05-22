package model;

import java.util.LinkedHashSet;
import java.util.Set;

public class User {
	
	private String nome;
	private String cognome;
	private String indirizzo;
	private Set<String> email;
	
	public User() {};

	public User(String nome, String cognome, String indirizzo) {
		email = new LinkedHashSet<>();
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
	}
	
	public User(String nome, String cognome, String indirizzo, Set<String> email) {
		this.email = email;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
	}
	
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<String> getEmail() {
		return email;
	}

	public void setEmail(Set<String> email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo
				+ ", mail=" + email + "\n";
	}
	
}
