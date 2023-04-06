package exercise1;

import java.util.Random;
import java.util.Scanner;

public class MorraCinese {
	
	public static void main(String[] args) {
		
		//Realizzare il gioco carta-forbice-sasso
		
		Scanner sc = new Scanner(System.in);
		
		//numero random generato per far accedere al pc alle possibilità
		Random r = new Random();
		
		//scelte possibili
		String [] possibilità = {"sasso","carta","forbice"};
		
		//inserimento giocatori
		String utente, pc;
		
		//varibile di stampa del risultato
		String mess=" ";
		
		//il pc fa il suo gioco
		int sceltaPc = r.nextInt(0,3);
		pc = possibilità[sceltaPc];
		System.out.println("scelta pc: " +  pc);
		
		//Sceglie l'utente
		System.out.println("Scegli 0-sasso 1-carta 2-forbice");
		int sceltaUt = sc.nextInt();
		utente = possibilità[sceltaUt];	
		System.out.println("scelta ut: " + utente);

		//si verificano le condizioni
		
		//in caso di pareggio
		if (pc.equals(utente)) {
			mess = "pareggio";
		//Sasso batte forbice
		}else if(pc.equals("sasso")&&utente.equals("forbice")) {
			mess="ha vinto il pc";
		}
		//forbice batte carta
		else if(pc.equals("forbice")&&utente.equals("carta")) {
			mess="ha vinto il pc";
		}
		//carta batte sasso
		else if(pc.equals("carta")&&utente.equals("sasso")) {
			mess="ha vinto il pc";
		}
		//il pc non è riuscito a battere l'utente, di conseguenza vince 
		else {
			mess="hai vinto complimenti";
		}
		
		//stampa del risultato
		System.out.println(mess);
		
		//chiusura dello scanner
		sc.close();
		
	}
	
}
