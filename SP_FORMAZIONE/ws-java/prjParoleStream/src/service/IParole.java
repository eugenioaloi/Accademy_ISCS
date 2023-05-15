package service;

public interface IParole {
	
	//restitusice il numero di parole presenti
	int countAll();
	
	/*restituisce tutte le parole presenti nel file*/
	String[] parole();
	
	/*restituisce il numero di occorrenze della parola*/
	int count(String parola);
	
	/*Restituisce la parola alfab + grande*/
	String parolaMax();
	
	/*Restituisce tutte le parole con meno di N caratteri*/
	String[] parolaPiuPiccola(int numChar);
	
}
