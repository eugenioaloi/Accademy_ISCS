package usabilita;

public class Studente {
	
	/*Supponiamo di dover creare un'applicazione per la gestione di un elenco di studenti.
	 *  Creiamo una classe "Studente" che rappresenta un singolo studente 
	 *  e contiene il nome, il cognome e l'età dello studente.
	 */
	
	 private String nome;
	 private String cognome;
	 private int eta;
	 
	public Studente(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
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
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	@Override
	public String toString() {
		return "Studente: " + nome + " " + cognome + " di anni " + eta;
	}
	 
	 


}
