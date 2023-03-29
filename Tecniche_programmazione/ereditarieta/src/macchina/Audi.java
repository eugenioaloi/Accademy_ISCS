package macchina;

public class Audi extends MacchinaAstratta {

	int prezzo = 30000;
	
	@Override
	void prezzo() {
		System.out.println("Il prezzo dell'Audi è " + prezzo);
	}

	@Override
	void descrizione() {
		System.out.println("Sono un'Audi");
	}
	
	static void alimentazione() {
		System.out.println("alimentazione Audi");
	}
	
}
