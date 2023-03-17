package morraCineseOOP;

import java.util.Random;
import java.util.Scanner;

public class MorraCineseTest {
	public static void main(String[] args) {
		
		MorraCinese mc = new MorraCinese();
		
		//gioca l'utente
		Scanner sc = new Scanner(System.in);
		System.out.println("Premi 0-sasso 1-carta 2-forbice");
		int sceltaUt = sc.nextInt();
		
		//gioca il pc
		Random r = new Random();
		int sceltaPc = r.nextInt(0,3);
		
		//check risultato del gioco
		String resGame = mc.checkGame(sceltaUt,sceltaPc);
		
		System.out.println(resGame);
		
		sc.close();
		
	}
}
