package commissioneContaParole;

import java.util.Arrays;

public class MainParole {
	
	public static void main(String[] args) {
		
		runProgramm();
	}
	
	private static void runProgramm() {
		String paroleInput = "ciao ciao cane";
		
		Parole p = new Parole(paroleInput);
		
		String s = "mare";
		
		p.addParola(s);
		System.out.println(p.existsParola(s));//true
		
		p.deleteParola(s);
		System.out.println(p.existsParola(s));//false
		
		System.out.println("Numero di parole inserite : " + p.contaParole());//2
		
		System.out.println("La parola ciao è stata inserita " + p.occorrenzaParola("ciao") + " volte"); //2
		
		System.out.println("La parola inserita più volte è: " + p.parolaConMaxOccorrenze() //ciao - 2
		+" ed è stata inserita " + p.maxOccorenzeNum());
		
		System.out.println("Le parole inserite sono: " + Arrays.toString(p.paroleArray())); //cane, ciao
		
	}
}
