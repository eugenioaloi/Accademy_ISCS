package contoCorrente;

public class TestContoCorrente {
	public static void main(String[] args) {
		
		ContoCorrente ccMario = new ContoCorrente(1000,"Mario Rossi");
		ContoCorrente ccMarco = new ContoCorrente(2000,"Marco Verdi");
		ContoCorrente ccLaura = new ContoCorrente(10000, "Laura Bianchi");
		ContoCorrente ccMaria = new ContoCorrente(50000, "Maria Neri");
		
		//metodi 1)preleva 2)versa 3)stampaSaldo 4)stampa nome e saldo del conto 
		
		System.out.println("************** Operatività ccMario ************** \n");
		ccMario.stampasaldo();//all'inzio il saldo equivale al deposito effettuato
		
		//preleva 
		System.out.println(ccMario.getNomeCliente()+ " ha prelevato " + ccMario.preleva(400) + " €");
		ccMario.stampasaldo();//saldo dopo il prelievo

		//versa
		System.out.println(ccMario.getNomeCliente()+ " ha versato " + ccMario.versa(300) + " €");
		
		//stampa saldo dopo il versamento e nome associato al CC
		ccMario.stampaSaldoENome();
		
		ccMario.preleva(1900);
		
		System.out.println("\n************** Operatività ccMarco ************** \n");
		
		ccMarco.stampasaldo();
		
		//preleva 
		System.out.println(ccMarco.getNomeCliente()+ " ha prelevato " + ccMarco.preleva(1750) + " €");
		ccMarco.stampasaldo();

		//versa
		System.out.println(ccMarco.getNomeCliente()+ " ha versato " + ccMarco.versa(4000) + " €");
		
		ccMarco.stampaSaldoENome();
		
		ccMarco.preleva(2500);
		
		System.out.println("\n************** Operatività ccLaura ************** \n");
		
		ccLaura.stampasaldo();
		
		//preleva 
		System.out.println(ccLaura.getNomeCliente()+ " ha prelevato " + ccLaura.preleva(450) + " €");
		ccLaura.stampasaldo();
		
		//versa
		System.out.println(ccLaura.getNomeCliente()+ " ha versato " + ccLaura.versa(0) + " €");
		
		ccLaura.stampaSaldoENome();
		
		ccLaura.preleva(6000);
		
		System.out.println("\n************** Operatività ccMaria ************** \n");
		
		ccMaria.stampasaldo();
		
		//preleva 
		System.out.println(ccMaria.getNomeCliente()+ " ha prelevato " + ccMaria.preleva(2500) + " €");
		ccMaria.stampasaldo();
		
		//versa
		System.out.println(ccMaria.getNomeCliente()+ " ha versato " + ccMaria.versa(650) + " €");
		
		ccMaria.stampaSaldoENome();
		
		ccMaria.preleva(75000);
		
		/*creazione di un'array con oggetti di tipo ContoCorrente per controllare l'incremento del codice ogni volta che viene
		generata una nuova istanza della classe ContoCorrente*/
		ContoCorrente [] cc = {ccMario,ccMarco,ccLaura,ccMaria};
		
		for(ContoCorrente conto:cc) {
			System.out.println("Il codice conto di " + conto.getNomeCliente() + " è " +conto.getCodConto());//1,2,3,4
		}
		
		ContoCorrente cc1 = new ContoCorrente(0, "Pippo");
		ContoCorrente cc2 = new ContoCorrente(0, "Pluto");
		System.out.println("Cod conto cc1: " + cc1.getCodConto());//5
		System.out.println("Cod conto cc2: " + cc2.getCodConto());//6
		
	}
}
