package listato2;

public class TestContoCorrente {
	public static void main(String[] args) {
		
		String [] codConti = {"CC1","CC2","CC3","CC4"};
		
		ContoCorrente ccMario = new ContoCorrente(1000,"Mario Rossi", codConti[0]);
		ContoCorrente ccMarco = new ContoCorrente(2000,"Marco Verdi", codConti[1]);
		ContoCorrente ccLaura = new ContoCorrente(10000, "Laura Bianchi", codConti[2]);
		ContoCorrente ccMaria = new ContoCorrente(50000, "Maria Neri",  codConti[3]);
		
		//metodi 1)preleva 2)versa 3)stampaSaldo 4)stampa nome e saldo del conto 
		
		
		//Operatività ccMario 
		System.out.println(ccMario.getNomeCliente()+ " ha prelevato " + ccMario.preleva(500) + " €");
		System.out.println(ccMario.getNomeCliente()+ " ha versato " + ccMario.versa(300) + " €");
		ccMario.stampasaldo();
		ccMario.stampaSaldoENome();
		
		
		
		//Operatività ccMarco 
		//Operatività ccLaura 
		//Operatività ccMaria 
		
		
	}

}
