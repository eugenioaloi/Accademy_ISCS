package ricercaBinaria;

import java.util.Arrays;

public class TestRicercaBinaria {
	public static void main(String[] args) {
		
		int[] arr= {9,6,4,2,8,3,1};
		Arrays.sort(arr);
		
		System.out.println("Array ordinato");
		System.out.println(Arrays.toString(arr));
		
		int elDaTrovare = 6;
		
		boolean trovato = RicercaBinaria.cerca(arr, elDaTrovare);
		
		System.out.println(trovato ? "trovato " : "non trovato ");
		
	}
}
