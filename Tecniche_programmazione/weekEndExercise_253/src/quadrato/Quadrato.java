package quadrato;

public class Quadrato {
	
	private int lato;
	
	public Quadrato(int l) {
		this.lato = l;
	}
	
	public int perimetro() {
		return lato*4;
	}
	
	public int area() {
		return (int) Math.pow(lato, 2);
	}
	
	public int getLato() {
		return lato;
	}
	
	public void setLato(int lato) {
		this.lato = lato;
	}
	
}
