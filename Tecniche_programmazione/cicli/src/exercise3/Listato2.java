package exercise3;

import java.util.Random;

public class Listato2 {
	
	public static void main(String[] args) {
		//numero casuale da 1 a 20
		//verifica se è presente in un insieme da 1 a 10
		//es: 15 - non è presente da 1 a 10
		
		
		Random r = new Random();
		int random = r.nextInt(1,21);
		
		switch(random) {
			case 1,2,3,4,5,6,7,8,9,10 -> {
					System.out.println("numero: " + random + " compreso nei primi 10 numeri");
					break;
				}
			default-> System.out.println("numero: " + random + " NON compreso nei primi 10 numeri");
		}
		
		//****** Utilizzo di una varibile di STATO *******************
		
		boolean flag = false;
		
		for(int i=1;i<=10;i++) {
			if(i==random) {
				flag= true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("numero: " + random + " compreso nei primi 10 numeri");
		}else {
			System.out.println("numero: " + random + " NON compreso nei primi 10 numeri");
		}
		
		
	}
}
