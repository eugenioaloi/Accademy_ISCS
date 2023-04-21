package formaGeometricaCorretto;

public class Cerchio extends Forma{
	
	final double PIGRECO = Math.PI;
	
	
	public Cerchio(double lato, String tipo) {
		super(lato, tipo);
		// TODO Auto-generated constructor stub
	}


	@Override
	double area() {
		return getLato()*getLato()*PIGRECO;
	}


	@Override
	double perimetro() {
		return 2*PIGRECO*getLato();
	}


}
