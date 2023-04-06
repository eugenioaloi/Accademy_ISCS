package listato4;

import java.util.Scanner;

public class Listato4_altro {
	public static void main(String[] args) {
		
		System.out.println("inserisci una stringa");
		Scanner sc = new Scanner(System.in);
		
		String parola = sc.nextLine();
		
		String parolaNoSpazi = parola.replace(" ", "");
		
		boolean palindroma= true;
		int sx,dx;
		
		//si controlla fino a metà se ci sono lettere uguali
		for(sx=0,dx=parolaNoSpazi.length()-1;sx<dx;sx++,dx--) {
			if(parolaNoSpazi.charAt(sx)!=parolaNoSpazi.charAt(dx)) {
				palindroma=false;
				break;
			}
		}

		System.out.println(parola + " è palindroma? "+ palindroma);
		
	}
}
