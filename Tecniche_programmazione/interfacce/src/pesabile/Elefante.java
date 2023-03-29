package pesabile;

public class Elefante extends Animale implements Pesabile {

	int peso;
	
	public Elefante(String nome, int eta, int peso) {
		super(nome, eta);
		this.peso = peso;
	}

	@Override
	public void pesa() {
		System.out.println("L'animale " + getNome() + " pesa " + peso);
		
	}

	@Override
	public void parla() {
		System.out.println("L'elefante barrisce");
	}

	@Override
	public void mangia() {
		System.out.println("L'elefante mangia le arachidi");
	}

}
