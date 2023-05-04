package contaParole;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ContaParole implements IcontaParole{

	private StringBuilder sb;
	
	public ContaParole(StringBuilder sb) {
		this.sb = sb;
	}

	@Override
	public Map<String, Integer> chiediParole() {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> paroliere = new HashMap<>();
		boolean flag = true;
		
		while(flag) {
			try {
				System.out.println("Vuoi inserire una parola? premi -0 per continuare -1 per uscire");
				int scelta = sc.nextInt();
				if(scelta==0) {
					System.out.println("Inserisci una parola");
					String s = sc.next();
					
					int conto = 1;//variabile di supporto per contare le parole che vengono inseriti
					
					this.sb.append(s+" ");
					
					if(paroliere.containsKey(s)) {
						int i = paroliere.get(s);
						paroliere.put(s, i+1);
					}else {
						paroliere.put(s, conto);
					}
				}else {
					flag = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Input sbagliato");
				sc.nextLine();
			}
		}
		return paroliere;
	}

	@Override
	public int stampaNumParole(Map<String, Integer> paroliere) {
		int conto = 0;
		
		for(String parole:paroliere.keySet()) {
			conto ++;
		}
		return conto;
	}
	
	@Override
	public StringBuilder getParole() {
		return sb;
	}

	@Override
	public void numOccorrenzeParole(Map<String, Integer> paroliere) {
		for(String parola:paroliere.keySet()) {
			System.out.println("Parole: " + parola + ", inserita " + paroliere.get(parola)+ " volte");
		}
	}

	@Override
	public String topParola(Map<String, Integer> paroliere) {
		int max = 0;
		String word = "";
		for(String parola:paroliere.keySet()) {
			if(paroliere.get(parola)>max) {
				max = paroliere.get(parola);
				word = parola;
			}
		}
		return word;
		
	}






	
	

}
