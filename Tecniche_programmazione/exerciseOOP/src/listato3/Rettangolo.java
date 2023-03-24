package listato3;

public class Rettangolo {
	
	/*
	 * @params base
	 * @params altezza
	 * */
	private int base, altezza;
	
	/*
	 * @params base, int
	 * @params altezza, int
	 * @constructor
	 * */
	public Rettangolo(int altezza, int base ) {
		setBase(base);
		setAltezza(altezza);
	}
	
	/*
	 * metodo ridimensiona, permette di risetare i valori di base e altezza del rettangolo costruito
	 * @params int, int
	 * */
	public void ridimensiona(int a, int b) {
		setBase(b);
		setAltezza(a);
	}
	
	/*
	 * metodo in grado di calcolare il perimetro del rettangolo
	 * @return int
	 * */
	public int perimetro() {
		int perimetro = 2*(base+altezza);
		return perimetro;		
	}
	
	/*
	 * metodo in grado di calcolare l'area del rettangolo
	 * @return int
	 * */
	public int area() {
		int area = base*altezza;
		return area;
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	@Override
	public String toString() {
		return "Il Rettangolo costrutito ha base " + base + " cm e altezza " + altezza + " cm";
	}

}
