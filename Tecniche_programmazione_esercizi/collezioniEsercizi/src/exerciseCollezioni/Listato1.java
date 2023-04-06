package exerciseCollezioni;

import java.util.ArrayList;
import java.util.Scanner;

public class Listato1 {
	public static void main(String[] args) {
		//il programma inserisci dei numeri chiesti all'utente in un ArrList
		//Se l'utente inserisce -1 il programma smetter di chiedere i numeri, mostra quelli inseriti e calcola la
		//somma dei numeri pari
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeri = new ArrayList<>();
		
		int num=0;
		
		boolean flag = num!=-1;
		
		while(flag) {
			System.out.println("Inserisci dei numeri: con -1 esci dal programma");
			num = sc.nextInt();
			numeri.add(num);
		}
		
		int sum=0;
		
		for (int i = 0; i < numeri.size(); i++) {
			if(numeri.get(i)%2==0) {
				sum += numeri.get(i);
			}
		}
		
		System.out.println("stampa Arr:" + numeri);
		System.out.println("sum: " + sum);
		
		sc.close();
		
	}
}
