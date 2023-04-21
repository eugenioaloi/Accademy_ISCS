package tipiGenerici;

public class TipiGenerici {
	public static void main(String[] args) {
		
		Integer[] numeri= {1,2,3,4};
		String[] parole = {"miao","bau","chip"};
		Double[] virgola = {1.1,2.2,3.3,4.4};
		Boolean [] booleani = {true, false, true, false};
		
		stampa(numeri);
		stampa(parole);
		stampa(virgola);
		stampa(booleani);
		
	}

	//T è una convenzione per indicare il tipo generico
	public static<T> void stampa(T[] tipiGenerico) {
		for(T tipo:tipiGenerico) {
			System.out.println(tipo);
		}
	}
	
	/*
	static void stampa(Integer[] interi) {
		for (Integer integer : interi) {
			System.out.println(integer);
		}
	}
	static void stampa(String[] parole) {
		for (String s : parole) {
			System.out.println(s);
		}
	}
	static void stampa(Double[] virgola) {
		for (Double v : virgola) {
			System.out.println(v);
		}
	}
	static void stampa(Boolean[] booleani) {
		for (Boolean integer : booleani) {
			System.out.println(integer);
		}
	}
	 * */
	
}
