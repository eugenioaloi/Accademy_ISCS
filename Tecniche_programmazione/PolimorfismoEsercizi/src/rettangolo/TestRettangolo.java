package rettangolo;

import java.util.Scanner;

public class TestRettangolo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci la base del rettangolo");
		int base = sc.nextInt();
		System.out.println("inserisci l'altezza del rettangolo");
		int altezza = sc.nextInt();
		
		
		Rettangolo r1 = new Rettangolo(base,altezza);
		
		System.out.println(r1);
		
		System.out.println("\n Il rettangolo viene ridimensionato con nuovi valori ");
		r1.ridimensiona(5, 10);
		
		System.out.println(r1);
		
		System.out.println("Perimetro: " + r1.perimetro());
		System.out.println("Area: "+ r1.area());
		
		sc.close();
	}
}
