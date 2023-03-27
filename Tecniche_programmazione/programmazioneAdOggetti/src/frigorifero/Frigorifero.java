package frigorifero;

import java.util.ArrayList;
import java.util.Arrays;

public class Frigorifero {
	public static void main(String[] args) {
		
		Cibo[] arrCibi = new Cibo[3];
		
		Cibo cibo1 = new Cibo("Pasta");
		Cibo cibo2 = new Cibo("Formaggio");
		Cibo cibo3 = new Cibo("Prosciutto");
		
		arrCibi[0] = cibo1;
		arrCibi[1] = cibo2;
		arrCibi[2] = cibo3;
		
		System.out.println("Nel frigorifero ci sono i seguenti cibi:");
		for(Cibo cibo:arrCibi) {
			System.out.println(cibo);
		}
		
		//si può stringare tutto in una sola riga usando oggetti anonimi
		Cibo [] dispensa = {new Cibo("Pasta"), new Cibo("Formaggio"), new Cibo("Prosciutto")};
		
		for(Cibo cibo:dispensa) {
			System.out.println(cibo);
		}
		
		ArrayList<Cibo> lista = new ArrayList<>(Arrays.asList(dispensa));
		
		lista.add(new Cibo("Insalata"));
		
		
		
	}

}
