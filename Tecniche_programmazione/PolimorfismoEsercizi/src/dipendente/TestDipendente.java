package dipendente;

public class TestDipendente {

	public static void main(String[] args) {
		
		Dipendente [] dipendenti = {new Dipendente("Gianni", 55, 1000), new Dipendente("Piero", 20, 1000),
				new Dipendente("Luigi", 40, 1000),new Dipendente("Marco", 30, 4000)};
		
		double totStipendio = 0;
		
		String paperone ="";
				
		for (Dipendente dip: dipendenti) {
			dip.aumento(10);
			totStipendio += dip.getStipendio();
			paperone = dip.trovaPaperone(dipendenti);
		}
		
		System.out.println("tot stipendio:" + totStipendio);
		System.out.println("Il dipendente che guadagna di più è " + paperone);
		
	}
}
