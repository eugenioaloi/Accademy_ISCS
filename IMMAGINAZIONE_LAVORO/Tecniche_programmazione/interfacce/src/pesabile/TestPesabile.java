package pesabile;

public class TestPesabile {
	public static void main(String[] args) {
		
		Pesabile[] oggettiPesabili = {new Camion("Scania", 700), new Elefante("dumbo", 2, 500)};
		
		for(Pesabile pes : oggettiPesabili) {
			pes.pesa();
		}
		
	}
}
