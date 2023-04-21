package predaPredatore;

public class Pesce implements Preda,Predatore{

	@Override
	public void caccia() {
		System.out.println("Il pesce sta nuotando più veloce per scappare dai pesci più grandi");
		
	}

	@Override
	public void scappa() {
		System.out.println("Il pesce si muove più veloce per mangiare altri pesci");
	}
	
}
