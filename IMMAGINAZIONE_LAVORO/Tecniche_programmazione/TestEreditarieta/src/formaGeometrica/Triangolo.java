package formaGeometrica;

public class Triangolo extends Forma {
	
	int base;
	int altezza;
	
	public Triangolo(int lato, String tipo) {
		super(lato, tipo);
	}
	
	@Override
	void perimetro() {//moltiplicare la misura dell'altezza per 2√3.
		double perimetro = altezza*(2*(Math.sqrt(3)));
		System.out.println("Il perimetro del triangolo è: " + perimetro);
	}

	@Override
	void area() {//base * altezza
		int area = base*altezza;
		System.out.println("L'area del triangolo è: " + area);
	}

}
