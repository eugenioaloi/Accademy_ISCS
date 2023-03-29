package formaGeometricaCorretto;

import java.util.ArrayList;
import java.util.Scanner;

public class TestForma {
	public static void main(String[] args) {
		
		ArrayList<Forma> forme = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci le dimensioni di base, altezza e raggio");
		int base = sc.nextInt();
		sc.nextLine();
		int altezza = sc.nextInt();
		sc.nextLine();
		int raggio = sc.nextInt();
		sc.nextLine();
		
		forme.add(new Rettangolo(base, "rettangolo", altezza));
		forme.add(new Quadrato(base, "quadrato", altezza));
		forme.add(new Cerchio(raggio, "cerchio"));
		forme.add(new Triangolo(base, "triangolo", altezza));
		
		forme.forEach(f->{
			System.out.println(f);
		});
		
		sc.close();
		
	}
}
