package formaGeometricaCorretto;

public abstract class Forma {

	private double lato;
	private String tipo;
	
	public Forma(double lato, String tipo) {
		this.lato = lato;
		this.tipo = tipo;
	}
	
	abstract double area();
	abstract double perimetro();
	
	
	public double getLato() {
		return lato;
	}
	public void setLato(double lato) {
		this.lato = lato;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return tipo+ " Area= " + area() + " Perimetro =" + perimetro();
	}
	
	
	
}
