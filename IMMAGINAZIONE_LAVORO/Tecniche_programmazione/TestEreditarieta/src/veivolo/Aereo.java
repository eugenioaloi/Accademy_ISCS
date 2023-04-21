package veivolo;

public class Aereo extends Veivolo {

	public Aereo(String modello, int velocita) {
		super(modello, velocita);
	}

	@Override
	void decollo() {
		System.out.println("Decolla da una pista lunga");
	}

	@Override
	void atterraggio() {
		System.out.println("Atterra abbassando le ruote");
	}

}
