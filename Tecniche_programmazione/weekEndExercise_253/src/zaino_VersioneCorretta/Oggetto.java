package zaino_VersioneCorretta;

public class Oggetto {
	
	private String nome;
	private int peso;
	
	public Oggetto(String nome, int peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Oggetto [nome=" + nome + ", peso=" + peso + "]";
	}
	
	
	

}
