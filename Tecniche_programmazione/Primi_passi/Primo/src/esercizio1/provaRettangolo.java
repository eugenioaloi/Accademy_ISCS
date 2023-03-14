package esercizio1;

public class provaRettangolo {
	
	public static void main(String[] args) {
		
		//calcolo perimetro e area di un rettangolo di b=25 h=40
		Rettangolo r1 = new Rettangolo();
		
		//area b*h
		int area = r1.getAltezza()*r1.getBase();
		
		//perimetro p=(b+h)*2
		int perimetro = (r1.getAltezza()+r1.getBase())*2;
		
		//stampa
		System.out.println("area: " + area);
		System.out.println("perimetro: " + perimetro);
		
	}

}
