package animale;


/* una classe è astratta quando ha almeno un metodo astratto
 * non può essere istanziata, cioè non può creare oggetti da questa classe
 * un metodo astratto non ha il corpo del testo
 * 
 * */

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
