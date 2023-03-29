package formaGeometrica;

public class Rettangolo extends Forma {
	
	int base;
	int altezza;
	
	public Rettangolo(int lato, String tipo) {
		super(lato, tipo);
	}
	
	@Override
	void perimetro() {//2(b+h)
		System.out.println("Il perimetro è: " + 2*(base+altezza));
	}

	@Override
	void area() {//base * altezza
		System.out.println("L'area è: " + (base+altezza));
	}

}
