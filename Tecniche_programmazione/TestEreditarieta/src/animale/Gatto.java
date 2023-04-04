package animale;

public class Gatto extends Animale{

	public Gatto(String nome, int eta) {
		super(nome, eta);
	}

	@Override
	public void parla() {
		System.out.println("Miao miao");
	}

	@Override
	public void mangia() {
		System.out.println("Mangia la scatoletta");
	}
	
}
