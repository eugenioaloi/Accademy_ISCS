package listato2;

import java.util.Arrays;
import java.util.Scanner;

public class Listato2 {
	public static void main(String[] args) {
		//Creare un array di 10 numeri in input. Visualizzare il valore massimo e il minimo 
		//degli elementi dell'array, e dire in che posizione si trovano.
		//Output: Array: -3 4 7 9 10 -8 -9 2 3 2
		
		//quando inserisco la seq 2 3 2 non funziona l'algoritmo perchè non controlla i numMinori
		//max= 10 in posizione 4, min= -9 in posizione 6
		
		Scanner sc = new Scanner(System.in);
		int [] numeri = new int [10];
		
		//var per valMax e ValMin
		int valMax = 1, valMin =0;
		
		//var per salvare le posizioni
		int posMax = 0, posMin =0;
		
		for(int i=0;i<numeri.length;i++) {
			System.out.println("Inserisci il " + (i+1)+" numero");
			int num = sc.nextInt();
			
			numeri[i] = num;
			if(num>valMax) {
				valMax = num;
				posMax = i;
			}else if(num<valMin) {
				valMin = num;
				posMin = i;
			}
		}
		
		System.out.println("Array di numeri creato: " +Arrays.toString(numeri));
		System.out.println("v max: " + valMax + " trovato alla posizione " + posMax );
		System.out.println("v min: " + valMin + " trovato alla posizione " + posMin );
		
		sc.close();
		
	}
}
