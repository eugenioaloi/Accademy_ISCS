package formaGeometricaCorretto;

public class Rettangolo extends Forma{
	
	protected double altezza;

	public Rettangolo(double lato, String tipo, double altezza) {
		super(lato, tipo);
		this.altezza = altezza;
	}

	@Override
	double area() {
		return getLato()*altezza;
	}

	@Override
	double perimetro() {
		return (getLato()+altezza)*2;
	}

}
