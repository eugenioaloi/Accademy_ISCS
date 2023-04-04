package garage;

import java.util.ArrayList;
import java.util.Scanner;

public class TestGarage {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quante macchine vuoi parcheggiare?");
		int posti = sc.nextInt();
		sc.nextLine();
		
		Garage g1 = new Garage("Garage 1");
		
		for (int i = 0; i <posti; i++) {
			System.out.println("Quale macchina vuoi parcheggiare?");
			g1.parcheggia(new Macchina(sc.nextLine()));
		}
		
		System.out.println("Il garage ha questi veicoli: ");
		System.out.println(g1);
		
		//insieme di macchine da parcheggiare
		ArrayList<Macchina> veicoli = new ArrayList<>();
		for (int i = 0; i < posti; i++) {
			System.out.println("Quale macchina vuoi parcheggiare?");
			veicoli.add(new Macchina(sc.nextLine()));//indico il tipo di macchine da parcheggiare
		}
		
		g1.parcheggiaTutti(veicoli);//parcheggia tutti i veicoli indicati nell'arraylist precedente
		
		sc.close();
		
	}
}
