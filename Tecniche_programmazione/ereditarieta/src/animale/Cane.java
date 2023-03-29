package animale;

public class Cane extends Animale{

	public Cane(String nome, int eta) {
		super(nome, eta);
	}

	@Override
	public void parla() {
		System.out.println("bau bau");
	}

	@Override
	public void mangia() {
		System.out.println("mangia le crocchette");
	}

}
