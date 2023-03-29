package formaGeometricaCorretto;

public class Triangolo extends Rettangolo {

	public Triangolo(double base,String tipo, double altezza) {
		super(base, tipo, altezza);
	}
	

	@Override
	double area() {
		return super.area()/2;
	}
	
	@Override
	double perimetro() {
		return getLato()*3;
	}
	
}
