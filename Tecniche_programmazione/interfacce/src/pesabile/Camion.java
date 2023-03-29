package pesabile;

public class Camion implements Pesabile{
	
	String nome;
	int peso;
	
	public Camion(String nome, int peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}

	@Override
	public void pesa() {
		System.out.println("Il camion " + nome + " pesa " + peso);
	}

}
