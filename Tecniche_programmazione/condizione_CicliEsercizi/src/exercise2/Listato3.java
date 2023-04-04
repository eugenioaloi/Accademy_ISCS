package exercise2;

import java.util.Random;

public class Listato3 {
	public static void main(String[] args) {
		
		//i giocatori sono 2 e ogni giocatore inizia con 30 punti
		//si utilizza un dado a 6 facce, ogni giocatore tira un dado
		//ogni round il giocatore con il numero sul dado inferiore perde punti in base al num mostrato sul dado
		//in caso di pareggio nessuno perde punti - perde chi finisce prima i punti
		
		Random r = new Random();
		
		int resGioc1 = 0;
		int resGioc2 = 0;
		
		int punteggioPl1 = 30;
		int punteggioPl2 = 30;
		
		while(punteggioPl1>0 && punteggioPl2>0) {
			
			//lancia gioc 1
			for(int i=0;i<1;i++) {
				int lancioDado = r.nextInt(1,7);
				resGioc1 = lancioDado;
				System.out.println("dado lanciato gioc1: " + resGioc1);
			}
			
			//lancia gioc 2
			for(int i=0;i<1;i++) {
				int lancioDado = r.nextInt(1,7);
				resGioc2 = lancioDado;
				System.out.println("dado lanciato gioc2: " + resGioc2);
			}
			
			//vince gioc1
			if(resGioc1>resGioc2) {
				punteggioPl2 -=resGioc1;
			}//vince giocatore 2
			else if(resGioc2>resGioc1) {
				punteggioPl1 -=resGioc2;
			}
			
			System.out.println("p1:" +punteggioPl1);
			System.out.println("p2:" +punteggioPl2);
		}
		
	}//chiusura main
}//chiusura classe
