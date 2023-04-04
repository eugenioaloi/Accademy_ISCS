package scuola;

public class Studente {
	
	private String nome, cognome;
	private int votoFinale;
	
	public Studente(String nome, String cognome, int votoFinale) {
		this.nome = nome;
		this.cognome = cognome;
		this.votoFinale = votoFinale;
	}

	/*
	public String promuovi() {
		String msg = votoFinale>=6? "promosso" : "bocciato";
		return msg;
	}
	*/
	
	public boolean isPromosso() {
		return votoFinale>=6;
	}

	public String promuovi() {
		return isPromosso()? "promosso" : "bocciato";
	}
	
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getVotoFinale() {
		return votoFinale;
	}

	public void setVotoFinale(int votoFinale) {
		this.votoFinale = votoFinale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", votoFinale=" + votoFinale + "]";
	}

}
