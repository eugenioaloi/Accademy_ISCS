package pesabile;

public abstract class Animale {
	
	private String nome;
	private int eta;
	
	public Animale(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}

	public abstract void parla();
	public abstract void mangia();
	
	
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

	@Override
	public String toString() {
		return "Animale [nome=" + nome + ", eta=" + eta + "]";
	}

}
