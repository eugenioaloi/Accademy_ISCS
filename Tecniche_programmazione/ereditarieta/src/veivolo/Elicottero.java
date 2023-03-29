package veivolo;

public class Elicottero extends Veivolo {

	public Elicottero(String modello, int velocita) {
		super(modello, velocita);
	}

	@Override
	void decollo() {
		System.out.println("Decolla da fermo avviando le pale");
	}

	@Override
	void atterraggio() {
		System.out.println("Elicottero atterra in verticale");
	}
	
}
