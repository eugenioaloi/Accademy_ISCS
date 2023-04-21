package veivolo;

public class TestVeivolo {
	
	public static void main(String[] args) {
		
		Veivolo[] veivoli = {
				new Aereo("boing 747", 600),
				new Elicottero("eli", 500),
				new Idrovolante("idro", 300)
		};

		for (Veivolo veiv : veivoli) {
			veiv.descrizione();
			veiv.decollo();
			veiv.atterraggio();
		}
		
		
	}
}
