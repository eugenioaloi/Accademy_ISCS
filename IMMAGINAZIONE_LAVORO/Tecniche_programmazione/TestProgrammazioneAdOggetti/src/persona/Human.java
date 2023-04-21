package persona;

public class Human {
	
	private String nome;
	private int eta;
	private Data dataNascita;
	
	public Human(String nome, int eta, int giorno, int mese, int anno) {
		this.nome = nome;
		this.eta = eta;
		dataNascita = new Data(giorno, mese, anno);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public Data getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Data dataNascita) {
		this.dataNascita = dataNascita;
	}

	@Override
	public String toString() {
		return nome + " di anni " + eta + "è nato il " + dataNascita + "]";
	}
	
	
	
	
	
	
	
}
