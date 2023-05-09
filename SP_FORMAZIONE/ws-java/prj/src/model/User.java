package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class User {
	
	private String nome;
	private String cognome;
	private String indirizzo;
	private Set<String> email;
	
	public User() {};
	
	public User(Set<String> email) {
		this.email = email;
	}
	
	public User(String nome, String cognome, String indirizzo) {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
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
