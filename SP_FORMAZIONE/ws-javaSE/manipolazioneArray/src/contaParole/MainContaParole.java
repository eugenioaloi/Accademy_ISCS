package contaParole;

import java.util.Map;

public class MainContaParole {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		ContaParole cp = new ContaParole(sb);
		
		Map<String, Integer> paroliere = cp.chiediParole();
		
		System.out.println("numero parole inserite: " + cp.stampaNumParole(paroliere));
		
		System.out.println("Parole inserite: " + cp.getParole());
		
		
		
	}

}
