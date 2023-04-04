package exerciseArray;

import java.util.Arrays;
import java.util.Scanner;

public class Listato5 {
	public static void main(String[] args) {
		
		//inserire 5 numeri seguiti da altri 5 numeri e stampa le 5 somme ottenute dalla somma dei numeri
		// nelle posizioni corrispondenti
		//ooutput: 
		//lista1 -> 6,10,8,5,12
		//lista2 -> 4,8,12,9,3
		//sum -> 10,18,20,24,15
		
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
		
		int [] sum = new int[5]; 
		
		for(int i= 0;i<lista1.length;i++) {
				sum[i] = lista1[i]+lista2[i];
		}
		
		System.out.println(Arrays.toString(sum));
		
		sc.close();
		
	}
}
