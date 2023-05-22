package commissioneContaParole;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Parole implements IParole{
	
	private Map<String, Integer> paroliere;
	
	public Parole() {
		this.paroliere = new HashMap<>();
	};
	
	public Parole(int maxParole) {
		this.paroliere = new HashMap<>(maxParole);
	};
	
	/*
	 * @parolaInput = stringa unica con le parole inserite separato da spazi
	 * */
	public Parole(String parolaInput) {
		this.paroliere = new HashMap<>();
		Scanner sc = new Scanner(parolaInput);
		while (sc.hasNext()) {
			addParola(sc.next());
		}
		sc.close();
	};
	
	public Parole(String ... parole) {
		this.paroliere = new HashMap<>();
	}
	
	//***** Metodi dell'interfaccia ********
	@Override
	public void addParola(String parola) {
		int conto = 1;
		
		if(paroliere.containsKey(parola)) {
			int i = paroliere.get(parola);
			paroliere.put(parola, i+1);
		}else {
			paroliere.put(parola, conto);
		}
	}

	@Override
	public boolean existsParola(String parola) {
		boolean exists = true;
		if(!paroliere.containsKey(parola)) {
			exists = false;
		}
		return exists;
	}

	@Override
	public void deleteParola(String parola) {
		if(paroliere.containsKey(parola)) {
			paroliere.remove(parola);
		}
	}

	@Override
	public int contaParole() {
		return paroliere.size();
	}

	@Override
	public int occorrenzaParola(String parola) {
		int num = 0;
		if(paroliere.containsKey(parola)) {
			num = paroliere.get(parola);
		}
		return num;
	}

	@Override
	public String parolaConMaxOccorrenze() {
		String word = "";
		int count = 0;
		for(String s:paroliere.keySet()) {
			int i = paroliere.get(s);
			if(i>count) {
				count = i;
				word = s;
			}
		}
		return word;
	}

	@Override
	public int maxOccorenzeNum() {
		int count = 0;
		for(String s:paroliere.keySet()) {
			int i = paroliere.get(s);
			if(i>count) {
				count = i;
			}
		}
		return count;
	}

	@Override
	public String[] paroleArray() {
		String [] arrStrings = new String[paroliere.size()];
		int i = 0;
		
		for(String parola:paroliere.keySet()) {
			arrStrings[i] = parola;
			i++;
		}
		Arrays.sort(arrStrings);
		
		return arrStrings;
	};
	
}
