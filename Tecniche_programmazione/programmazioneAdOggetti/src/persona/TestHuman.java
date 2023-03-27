package persona;

public class TestHuman {
	public static void main(String[] args) {
		
		Human p = new Human("Pippo", 50, 3, 4, 1973);
		
		System.out.println(p);
		
		Data quandoSeiNato = p.getDataNascita();
		System.out.println(quandoSeiNato);
		
		//Data d = new Data(26, 1, 1990);
		
		p.setDataNascita(new Data(26, 1, 1990));//al metodo viene passato un oggetto anonimo
		
		System.out.println(p.getDataNascita());
		
		new Human("Mario", 20, 10, 5, 2000).getDataNascita();//l'oggetto anonimo può chiamare direttamente il metodo
		
		
	}

}
