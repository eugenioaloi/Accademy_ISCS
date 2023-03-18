package listato1;
import java.util.Arrays;
import java.util.Scanner;

public class Listato1 {
	public static void main(String[] args) {
		//il programma chiede dueListe di 5 numeri all'utente
		//stampa quanti numeri sono presenti in entrambi i gruppi e la loro somma
		//OUTPUT: 
		//LISTA 1: 6,10,8,5,12
		//LISTA 1: 4,8,12,9,3
		//Le due liste hanno due numeri in comune: 8 e 12. La loro somma è:20
		
		int [] lista1 = new int[5];
		int [] lista2 = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		//ins lista1
		System.out.println("Inserisci i numeri nella prima lista");
		for (int i= 0;i<lista1.length;i++) {
			System.out.println("Inserisci il numero " + (i+1));
			lista1[i] = sc.nextInt();
		}
		
		//ins lista2
		System.out.println("Inserisci i numeri nella seconda lista");
		for (int i= 0;i<lista2.length;i++) {
			System.out.println("Inserisci il numero " + (i+1));
			lista2[i] = sc.nextInt();
		}
		
		
		System.out.println(Arrays.toString(lista1));
		System.out.println(Arrays.toString(lista2));
		
		int sumEq= 0;
		
		for(int i=0;i<lista1.length;i++) {
			for(int j=0;j<lista2.length;j++) {
				if(lista1[i]==lista2[j]) {
					sumEq += lista1[i];
				}
			}
		}			
			
		//stampa la somma tra i termini uguali	
		System.out.println("La somma tra gli elementi uguali è: " + sumEq);
		
		sc.close();
					
	}
}

		
		
		
		
