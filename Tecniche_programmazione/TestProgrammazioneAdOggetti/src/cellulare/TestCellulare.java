package cellulare;

public class TestCellulare {
	public static void main(String[] args) {
		
		Cellulare iphone10 = new Cellulare("Iphone", "10", 0, 0);
		
		//ricarico il cellulare
		iphone10.ricarica(50.0);
		
		//effettuo una chiamata
		iphone10.chiama(13);
		
		//credito residuo
		System.out.println("Credito rimasto: " + iphone10.getCredito());
		
		//numero di chiamate effettuate
		System.out.println("Chiamate effettuate: " + iphone10.getNumeroChiamate());
		
		iphone10.chiama(25);
		
		//chiamata al metodo per capire se ci sono ancora soldi nel saldo
		System.out.println("Ho finito i soldi? " + iphone10.creditoEsaurito());
		
	}
}
