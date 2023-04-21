package formaGeometrica;

public abstract class Forma {
	
	int lato;
	String tipo;
	
	public Forma(int lato, String tipo) {
		this.lato = lato;
		this.tipo = tipo;
	}

	abstract void perimetro();
	
	abstract void area();
	
	public void descrizione() {
		System.out.println("Questa figura è un " + tipo);
	}

}
