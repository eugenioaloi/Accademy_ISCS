package quadrato;

public class Quadrato {
	
	private int lato;
	
	public Quadrato(int l) {
		this.lato = l;
	}
	
	public int perimetro() {
		int perimetro = lato*4;
		return perimetro;
	}
	
	public int area() {
		int area = (int) Math.pow(lato, 2);
		return area;
	}
	
	public int getLato() {
		return lato;
	}
	
	public void setLato(int lato) {
		this.lato = lato;
	}
	
}
