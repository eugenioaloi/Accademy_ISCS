package exercise1;

import java.util.Scanner;

public class Listato1 {
	public static void main(String[] args) {
		//due numeri interi a e b scritti dall'utente
		//se b è pari scambia il valore delle var, altrimenti somma
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert 2 number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//if even
		if(b%2==0) {
			int temp = a;
			a=b;
			System.out.println("a: " + a + " b: " + temp );
		//if odd
		}else {
			int sum = a+b;
			System.out.println("sum: " + sum);
		}
		
		sc.close();
	}
}
