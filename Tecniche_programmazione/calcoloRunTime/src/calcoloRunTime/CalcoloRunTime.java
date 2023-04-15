package calcoloRunTime;

public class CalcoloRunTime {
	public static void main(String[] args) {
		
		long inizio = System.nanoTime();
		
		//******* AVVIO DEL PROGRAMMA
		
		// aggiunta del thread
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//***********************
		
		long tempo = (System.nanoTime()-inizio)/1_000_000;
		
		System.out.println("Il programma ha impiegato " + tempo + "ms");
		
		
	}

}
