package veivolo;

public abstract class Veivolo {
	
	private String modello;
	private int velocita;
	
	public Veivolo(String modello, int velocita) {
		this.modello = modello;
		this.velocita = velocita;
	}

	void descrizione() {
		System.out.println("La velocità massima di " + modello + " è " + velocita);
	}
	
	abstract void decollo();
	
	abstract void atterraggio();
	
	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getVelocita() {
		return velocita;
	}

	public void setVelocita(int velocita) {
		this.velocita = velocita;
	}

}
