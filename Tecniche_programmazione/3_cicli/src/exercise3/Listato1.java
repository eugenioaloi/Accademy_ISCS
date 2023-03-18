package exercise3;

import java.util.Random;

public class Listato1 {
	public static void main(String[] args) {
		
		//nell'intervallo da 0 ad un numero casuale (0-100)
		//contare quanti sono pari e quanti dispari
		//es: num 41 pari 20 dispari 21
		
		Random r = new Random();
		int random = r.nextInt(101);
		int pari = 0;
		int dispari = 0;
		
		for(int i = 1;i<random;i++) {
			if(i%2==0) {
				pari++;
			}else {
				dispari++;
			}
		}
		
		System.out.println("numero generato: " + random);
		System.out.println("pari: " + pari);
		System.out.println("dispari: " + dispari);
		
		
	}

}
