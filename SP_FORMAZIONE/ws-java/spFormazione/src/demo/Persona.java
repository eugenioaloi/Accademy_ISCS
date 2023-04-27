package demo;

import java.util.Date;

public class Persona {
	
		private String nome;
		private String cognome;
		private Date data_nascita;
		
		public Persona(String nome, String cognome, Date data_nascita) {
			this.nome = nome;
			this.cognome = cognome;
			this.data_nascita = data_nascita;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCognome() {
			return cognome;
		}

		public void setCognome(String cognome) {
			this.cognome = cognome;
		}

		public Date getData_nascita() {
			return data_nascita;
		}

		public void setData_nascita(Date data_nascita) {
			this.data_nascita = data_nascita;
		}

		@Override
		public String toString() {
			return "Persona [nome=" + nome + ", cognome=" + cognome + ", data_nascita=" + data_nascita + "]";
		}
		
		
		

}
