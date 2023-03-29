package macchina;

public abstract class MacchinaAstratta {
	
	int prezzo=1;
	
	abstract void prezzo();

	abstract void descrizione();
	
	static void alimentazione() {
		System.out.println("Mi alimento in modo generico");
	}
	
}
