package veivolo;

public class Idrovolante extends Veivolo{

	public Idrovolante(String modello, int velocita) {
		super(modello, velocita);
	}

	@Override
	void decollo() {
		System.out.println("Decolla sull'acqua");
	}

	@Override
	void atterraggio() {
		System.out.println("Può atterrare sull'acqua o sulla terra");
	}
	
}
