package macchina;

public class Tesla extends MacchinaAstratta {

	int prezzo = 50000;
	
	@Override
	void prezzo() {
		System.out.println("Il prezzo della Tesla è " + prezzo);
	}

	@Override
	void descrizione() {
		System.out.println("Sono una Tesla");
	}
	
	static void alimentazione() {
		System.out.println("alimentazione Tesla");
	}
	
}
